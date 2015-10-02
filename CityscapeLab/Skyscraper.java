import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;

/**
 * Create a skyscraper on the page
 * 
 * @author Connor Chong
 * @version 10-2-15
 */
public class Skyscraper
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;
    private int floors;

    /**
     * Constructs a car with a given top left corner
     * @param x the x coordinate of the top left corner
     * @param y the y coordinate of the top left corner
     */
    public Skyscraper(int x, int y, int numberOfFloors)
    {
        xLeft = x;
        yTop = y;
        floors = numberOfFloors; 
    }

    /**
     * Draws the outline of the whole building
     * @param   g2    graphics context
     */
    public void draw (Graphics2D g2)
    {
        
        Rectangle outline = new Rectangle(xLeft, yTop + 10, 300, 50 + floors*50);
        g2.setColor(Color.black);
        g2.fill((outline);
        
        boolean ifOutside = false;
        int windowCounter = 0;
        while (ifOutside = false)
        {
            Rectangle windowColumn1 = new Rectangle (xLeft , yTop + 40(windowCounter), 30, 30);
            windowCounter =  windowCounter+ 1;
            if (yTop <= 50 + floors*50)
            {
                
                
            }    
        }
  
    }
}
