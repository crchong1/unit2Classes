import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Sun shape 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sun
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;

    /**
     * Constructs a car with a given top left corner
     * @param x the x coordinate of the top left corner
     * @param y the y coordinate of the top left corner
     */
    

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
