import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Sun shape 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moon
{
    /**
     * Draws the moon as a circle 
     * @param   g2    graphics context
     */
        
    public void drawMoon (Graphics2D g2)
    {
        Ellipse2D.Double moon = new Ellipse2D.Double(20, 20, 100, 100);
        g2.setColor(Color.GRAY);
        g2.fill(moon);
        
    }
    
}
