import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @ Connor Chong @gcschmit
 * @version 10-5-15
 */
public class CityscapeComponent extends JComponent
{
    /** instanceVar int floors in units of floors */
    private int floors;
    
    /** instanceVar String ifDay */
    private String ifDay;
    
    /** instanceVar int xcoordinate which designates x coordinate for the sun */
    private int xcoordinate;
    
    /** instanceVar int ycoordinate which designates y coordinate for the sun */
    private int ycoordinate;
    
    /** instanceVar int xcoordinate2 which designates x coordinate for the moon */
    private int xcoordinate2;
    
    /** instanceVar int ycoordinate2 which designates y coordinate for the moon */
    private int ycoordinate2;
    
    /** instanceVar Sun sun which creates a Sun object at (xcoordinate, ycoordinate) */
    private Sun sun = new Sun(xcoordinate, ycoordinate);
    
    /** instanceVar Moon moon which creates a Moon object at (xcoordinate2, ycoordinate2)*/
    private Moon moon = new Moon(xcoordinate2, ycoordinate2);

    /**
     * Constructor CityscapeComponent which imports the numberOfFloors and the String day
     * @post have buildings drawn and either a sun or a moon
     * @param Graphics g to draw the sun and moon and the skyscrapers
     */
    public CityscapeComponent(int numberOfFloors, String day)
    {
        this.floors = numberOfFloors;   // set instance variable floors = numberOfFloors
        this.ifDay = day;               // set instance variable ifDay = day
    }    
    
    
    /**
     * paintComponent method that draws either the sun or moon, as well as 4 buildings
     *
     * @post have buildings drawn and either a sun or a moon
     * @param Graphics g to draw the sun and moon and the skyscrapers
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        if (ifDay.equals("day"))                         // if ifDay = true
        {
            Backdrop day = new Backdrop(ifDay);   // Create day object from Backdrop class, passing boolean ifDay to Backdrop
            day.drawBackdrop(g2);                 // Draws the sky blue backdrop 
            sun.drawSun(g2);                      // Draws the sun object   
        }
        else                                      // else ifDay is not true
        {
            Backdrop night = new Backdrop(ifDay); // Create night object from Backdrop class, passing boolean ifDay to Backdrop
            night.drawBackdrop(g2);               // Draws the black backdrop 
            moon.drawMoon(g2);                    // Draws the moon object
        }    
        
        Skyscraper skyscraper1 = new Skyscraper(30, 100, floors);  // Create object skyscraper1 with parameters (x position, y position, number of floors) respectively
        skyscraper1.drawSkyscraper(g2);                           // Draws skyscraper1
        
        Skyscraper skyscraper2 = new Skyscraper (250, 100, floors);// Create object skyscraper2 with parameters (x position, y position, number of floors) respectively
        skyscraper2.drawSkyscraper(g2);                           // Draws skyscraper2  
        
        Skyscraper skyscraper3 = new Skyscraper (470, 100, floors);// Create object skyscraper2 with parameters (x position, y position, number of floors) respectively
        skyscraper3.drawSkyscraper(g2);                           // Draws skyscraper3  
        
        Skyscraper skyscraper4 = new Skyscraper (690, 100, floors);// Create object skyscraper2 with parameters (x position, y position, number of floors) respectively
        skyscraper4.drawSkyscraper(g2);                           // Draws skyscraper4  
    }    
    
    /**
     * Animate the cityscape by moving the sun or the moon in the shape of a sine wave (idk why I decided to do a sine wave)
     * @post have either a sun or a moon animated
     * @param int increment from CityscapeViewer class
     */
    public void nextFrame(int increment)
    {
        if (ifDay.equals("day"))                         // if ifDay = true
        { 
            double dy;                                                                  // declare double dy
            double y;                                                                   // declare double y
            double siny;                                                                // declare double sin x
            double newSinY;                                                             // declare double newSinY 
            // update the objects in the cityscape so they are animated
            // Sin(x)
            dy = (increment*2*Math.PI)/200;                                         // Stretches graph over a large distance so we can see it
            y = 50* Math.sin(dy) + 150;                                             // Get the Y value of the sin x
            y = y + .5;                                                             // Rounds number to nearest whole int
            int newY = (int) y;                                                     // Rounds number to nearest whole int using (int)
            sun.moveSun(increment, newY-60);                                        // Moves sun to the point
            repaint();
        }
        
        else 
        {
            double dy;                                                                  // declare double dy
            double y;                                                                   // declare double y
            double siny;                                                                // declare double sin x
            double newSinY;                                                             // declare double newSinY 
            // update the objects in the cityscape so they are animated
            // Sin(x)
            dy = (increment*2*Math.PI)/200;                                         // Stretches graph over a large distance so we can see it
            y = 50* Math.sin(dy) + 150;                                             // Get the Y value of the sin x
            y = y + .5;                                                             // Rounds number to nearest whole int
            int newY = (int) y;                                                     // Rounds number to nearest whole int using (int)
            moon.moveMoon(increment, newY-60);                                      // Moves moon to the point
            repaint();
        }    
    }
}
