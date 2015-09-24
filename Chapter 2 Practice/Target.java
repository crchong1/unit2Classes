import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Circle shape that can be positioned anywhere on the screen
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;

    /**
     * Constructs a car with a given top left corner
     * @param x the x coordinate of the top left corner
     * @param y the y coordinate of the top left corner
     */
    public Target(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws the white circle
     * @param   g2    graphics context
     */
        
    public void drawWhite (Graphics2D g2, int diameter)
    {
        Ellipse2D.Double whiteCircle = new Ellipse2D.Double(xLeft + 50, yTop + 50, diameter, diameter);
        g2.draw(whiteCircle);
        g2.setColor(Color.WHITE);
        g2.fill(whiteCircle);
        
    }
    
     /**
     * Draws the black circle
     * @param   g2    graphics context
     */
        
    public void drawBlack (Graphics2D g2, int diameter2)
    {
        Ellipse2D.Double blackCircle = new Ellipse2D.Double(xLeft + 50, yTop + 50, diameter2, diameter2);
        g2.draw(blackCircle);
        g2.setColor(Color.BLACK);
        g2.fill(blackCircle);
    }
    
    public void drawCyan(Graphics2D g2, int diameter)
    {
        Ellipse2D.Double cyanCircle = new Ellipse2D.Double(xLeft + 50, yTop + 50, diameter, diameter);
        g2.draw(cyanCircle);
        g2.setColor(Color.CYAN);
        g2.fill(cyanCircle);
        
    }
    
    public void drawBlue (Graphics2D g2, int diameter)
    {
        Ellipse2D.Double blueCircle = new Ellipse2D.Double(xLeft + 50, yTop + 50, diameter, diameter);
        g2.draw(blueCircle);
        g2.setColor(Color.BLUE);
        g2.fill(blueCircle);
        
    }
}
