import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Creates a sun 
 * 
 * @Connor Chong 
 * @10-7-15
 */
public class Sun
{
    /** instanceVar int x which designates x coordinate for the sun */
    private int x;
    
    /** instanceVar int y which designates y coordinate for the sun */
    private int y;

    /**
     * Constructor for objects of class Sun
     * @pre get the x and y coordinates
     * @post initializes xCoordinate and yCoordinate
     * @param int xCoordinate, int yCoordinate
     */
    public Sun (int xCoordinate, int yCoordinate)
    {
        this.x = xCoordinate;
        this.y = yCoordinate;
    }
    
    /**
     * Draws the sun as a circle 
     * @param   g2    graphics context
     */        
    public void drawSun (Graphics2D g2)
    {
        Ellipse2D.Double sun = new Ellipse2D.Double(x, y, 150, 150);
        g2.setColor(Color.YELLOW);
        g2.fill(sun);     
    }
    
    /**
     * Moves the sun to set coordinates
     * @param  int newX, int newY
     */
    public void moveSun(int newX, int newY)
    {
        x = newX;
        y = newY;
    }
}
