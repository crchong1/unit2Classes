import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Rectangle;
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
        floors = numberOfFloors - 2; 
    }
    
      
    
    /**
     * Draws the outline of the whole building
     * @param   g2    graphics context
     */
    public void draw (Graphics2D g2)
    {
        // Creates the outline of the skyscraper with the xLeft and yTop starting position. 
        Rectangle outline = new Rectangle(xLeft, yTop + 10, 170, 50 + floors*50); // height is dependent on floors
        
        Random randomColor = new Random();
        int red = randomColor.nextInt(256);
        int green = randomColor.nextInt(256);
        int blue = randomColor.nextInt(256);
        Color newColor = new Color(red,green,blue);
        g2.setColor(newColor);  // color random
        g2.fill(outline);          // fill with black
        
                
        boolean ifOutside = false; // declare boolean ifOutside to false
        int windowCounter = 1;     // declare windowCounter
        do 
        {
            Rectangle windowColumn1 = new Rectangle (xLeft + 10 , yTop + 40*(windowCounter), 30, 30); // change starting position of each window
            if ((yTop + 40*windowCounter) >= (10 + floors*50)) // if the starting position of the window is outside of the total height of outline
            {
                ifOutside = true;    // set ifOutside to true to escape while loop;
            }
            windowCounter =  windowCounter + 1;    // increment windowCounter by 1 each for each instance of the while loop
            g2.setColor(newColor);  // set color to yellow
            g2.fill(windowColumn1);     // fill color to yellow
                
        } while (ifOutside == false); // while loop to keep creating rectangular windows
  
        ifOutside = false; 
        windowCounter = 1;
        do 
        {
            Rectangle windowColumn2 = new Rectangle (xLeft + 50 , yTop + 40*(windowCounter), 30, 30); // change starting position of each window
            if ((yTop + 40*windowCounter) >= (10 + floors*50)) // if the starting position of the window is outside of the total height of outline
            {
                ifOutside = true;    // set ifOutside to true to escape while loop;
            }
            windowCounter =  windowCounter + 1;    // increment windowCounter by 1 each for each instance of the while loop
            g2.setColor(newColor);  // set color to blue
            g2.fill(windowColumn2);     // fill color to blue
                
        } while (ifOutside == false); // while loop to keep creating rectangular windows
        
        
        ifOutside = false; 
        windowCounter = 1;
        do 
        {
            Rectangle windowColumn3 = new Rectangle (xLeft + 90 , yTop + 40*(windowCounter), 30, 30); // change starting position of each window
            if ((yTop + 40*windowCounter) >= (10 + floors*50)) // if the starting position of the window is outside of the total height of outline
            {
                ifOutside = true;    // set ifOutside to true to escape while loop;
            }
            windowCounter =  windowCounter + 1;    // increment windowCounter by 1 each for each instance of the while loop
            g2.setColor(Color.GREEN);  // set color to blue
            g2.fill(windowColumn3);     // fill color to blue
                
        } while (ifOutside == false); // while loop to keep creating rectangular windows
        
        ifOutside = false; 
        windowCounter = 1;
        do 
        {
            Rectangle windowColumn4 = new Rectangle (xLeft + 130 , yTop + 40*(windowCounter), 30, 30); // change starting position of each window
            if ((yTop + 40*windowCounter) >= (10 + floors*50)) // if the starting position of the window is outside of the total height of outline
            {
                ifOutside = true;    // set ifOutside to true to escape while loop;
            }
            windowCounter =  windowCounter + 1;    // increment windowCounter by 1 each for each instance of the while loop
            g2.setColor(Color.RED);  // set color to blue
            g2.fill(windowColumn4);     // fill color to blue
                
        } while (ifOutside == false); // while loop to keep creating rectangular windows
    }
}
