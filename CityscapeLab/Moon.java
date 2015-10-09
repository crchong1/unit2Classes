import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Creates a moon
 * @author Connor Chong
 * @version (a version number or a date)
 */
public class Moon
{
    /** instanceVar int x2 which designates x coordinate for the moon */
    private int x2;
    
    /** instanceVar int y2 which designates y coordinate for the moon */
    private int y2;

    /**
     * Constructor for objects of class Moon
     * @pre get the x and y coordinates
     * @post initializes xCoordinate and yCoordinate
     * @param int xCoordinate, int yCoordinate
     */
    public Moon (int xCoordinate, int yCoordinate)
    {
        this.x2 = xCoordinate;
        this.y2 = yCoordinate;
    }
    
    /**
     * Draws the moon as a circle 
     * @param   g2    graphics context
     */
        
    public void drawMoon (Graphics2D g2)
    {
        Ellipse2D.Double moon = new Ellipse2D.Double(x2, y2, 100, 100);
        g2.setColor(Color.GRAY);
        g2.fill(moon);
        
    }
    
    /**
     * Moves the moon to set coordinates
     * @param  int newX2, int newY2
     */
    public void moveMoon(int newX2, int newY2)
    {
        x2 = newX2;
        y2 = newY2;
    }
}
