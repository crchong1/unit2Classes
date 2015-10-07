import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Draws a Sun shape 
 * 
 * @Connor Chong 
 * @10-7-15
 */
public class Sun
{
    /** boolean ifDay where true is day and false is night */
    private String ifDay;

    /**
     * Default constructor for objects of class Backdrop
     */
    public Sun ()
    {
      
    }
    /**
     * Draws the sun as a circle 
     * @param   g2    graphics context
     */
        
    public void drawSun (Graphics2D g2)
    {
        Ellipse2D.Double sun = new Ellipse2D.Double(700, 20, 150, 150);
        g2.setColor(Color.YELLOW);
        g2.fill(sun);     
    }   
}
