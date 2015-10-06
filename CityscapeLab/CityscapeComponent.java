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
    // define the objects in your Cityscape as instance variables
    // ...
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
        
        if (ifDay = true)
        {
            Sun sun = new Sun();
            sun.drawSun(g2);
        }
        else 
        {
            Moon moon = new Moon();
            moon.drawMoon(g2);
        }    
        
        Skyscraper skyscraper1 = new Skyscraper(30, 30, floors);
        skyscraper1.drawSkyscraper(g2);
        
        Skyscraper skyscraper2 = new Skyscraper (250, 30, floors);
        skyscraper2.drawSkyscraper(g2);
        
        
    }
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    //public void paintComponent(Graphics g)
    //{
   //     Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        // ...
        
        
  // }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
   // public void nextFrame()
   // {
        // update the objects in the cityscape so they are animated
        // ...
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
   //     repaint();
   // }

}
