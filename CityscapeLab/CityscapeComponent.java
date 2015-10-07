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

    private int floors;
    private boolean ifDay;
    public CityscapeComponent(int numberOfFloors, boolean day)
    {
        this.floors = numberOfFloors;
        this.ifDay = day;
    }    
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        if (ifDay = true)                         // if ifDay = true
        {
            Backdrop day = new Backdrop(ifDay);   // Create day object from Backdrop class, passing boolean ifDay to Backdrop
            day.drawBackdrop(g2);                 // Draws the sky blue backdrop 
            Sun sun = new Sun();                  // Create sun object from Sun class
            sun.drawSun(g2);                      // Draws the sun object
        }
        else                                      // else ifDay is not true
        {
            Backdrop night = new Backdrop(ifDay); // Create night object from Backdrop class, passing boolean ifDay to Backdrop
            night.drawBackdrop(g2);               // Draws the black backdrop 
            Moon moon = new Moon();               // Create moon object from moon class
            moon.drawMoon(g2);                    // Draws the moon object
        }    
        
        Skyscraper skyscraper1 = new Skyscraper(30, 30, floors);  // Create object skyscraper1 with parameters (x position, y position, number of floors) respectively
        skyscraper1.drawSkyscraper(g2);                           // Draws skyscraper1
        
        Skyscraper skyscraper2 = new Skyscraper (250, 30, floors);// Create object skyscraper2 with parameters (x position, y position, number of floors) respectively
        skyscraper2.drawSkyscraper(g2);                           // Draws skyscraper2  
    }
            
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated      
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        // repaint();
    }
}
