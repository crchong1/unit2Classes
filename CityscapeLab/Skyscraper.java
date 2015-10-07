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
    /** Specifies the x position */
    private int xLeft;
    
    /** Specifies the y position */
    private int yTop;
    
    /** Specifies the number of floors in an integer number of floors */
    private int floors;

    /**
     * Constructs a skyscraper with a given top left corner
     * @param x the x coordinate of the top left corner
     * @param y the y coordinate of the top left corner
     * @param numberOfFloors the number of floors of the skyscraper
     */
    public Skyscraper(int x, int y, int numberOfFloors)
    {
        xLeft = x;
        yTop = y;
        floors = numberOfFloors - 2; 
    }
    
    
    /**
     * This method generates a random color from the random number generator
     * @post       gives a Color object that is a random color
     */
    public Color randomColor()
    {
        Random randomNumber = new Random();        // Create randumNumber object from Random class
        int red = randomNumber.nextInt(256);       // Declare int red that is a random int up to 256
        int green = randomNumber.nextInt(256);     // Declare int green that is a random int up to 256
        int blue = randomNumber.nextInt(256);      // Declare int blue that is a random int up to 256
        Color newColor = new Color(red,green,blue);// Create newColor object that is a random combination of red, green and blue 
        return newColor;                           // returns newColor
    }
    
    /**
     * Draws the outline of the whole building and also creates windows. The number of windows corresponds with the number of floors
     * @param   g2    graphics context
     * @post       creates a black rectangle with random color windows
     */
    public void drawSkyscraper (Graphics2D g2)
    {
        // Creates the outline of the skyscraper with the xLeft and yTop starting position. 
        Rectangle outline = new Rectangle(xLeft, yTop + 10, 170, 50 + floors*50); // height is dependent on floors
        
        g2.setColor(Color.BLACK);  // color black
        g2.fill(outline);          // fill with black
        
                
        boolean ifOutside = false; // declare boolean ifOutside to false
        int windowCounter = 1;     // declare windowCounter
        do 
        {
            Rectangle windowColumn1 = new Rectangle (xLeft + 10 , yTop + 40*(windowCounter), 30, 30); // change starting position of each window
            if ((yTop + 40*windowCounter) >= (10 + floors*50))                                        // if the starting position of the window is outside of the total height of outline
            {
                ifOutside = true; // set ifOutside to true to escape while loop;
            }
            windowCounter =  windowCounter + 1;    // increment windowCounter by 1 each for each instance of the while loop
            g2.setColor(randomColor());            // call randomColor() method to generate random color
            g2.fill(windowColumn1);                // fill window
                
        } while (ifOutside == false); // while loop to keep creating rectangular windows
  
        ifOutside = false; 
        windowCounter = 1;
        do 
        {
            Rectangle windowColumn2 = new Rectangle (xLeft + 50 , yTop + 40*(windowCounter), 30, 30); // change starting position of each window
            if ((yTop + 40*windowCounter) >= (10 + floors*50))                                        // if the starting position of the window is outside of the total height of outline
            {
                ifOutside = true;    // set ifOutside to true to escape while loop;
            }
            windowCounter =  windowCounter + 1;    // increment windowCounter by 1 each for each instance of the while loop
            g2.setColor(randomColor());            // call randomColor() method to generate random color
            g2.fill(windowColumn2);                // fill window
                
        } while (ifOutside == false); // while loop to keep creating rectangular windows
        
        
        ifOutside = false; 
        windowCounter = 1;
        do 
        {
            Rectangle windowColumn3 = new Rectangle (xLeft + 90 , yTop + 40*(windowCounter), 30, 30); // change starting position of each window
            if ((yTop + 40*windowCounter) >= (10 + floors*50))                                        // if the starting position of the window is outside of the total height of outline
            {
                ifOutside = true;    // set ifOutside to true to escape while loop;
            }
            windowCounter =  windowCounter + 1;    // increment windowCounter by 1 each for each instance of the while loop
            g2.setColor(randomColor());            // call randomColor() method to generate random color
            g2.fill(windowColumn3);                // fill window
                
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
            g2.setColor(randomColor());            // call randomColor() method to generate random color
            g2.fill(windowColumn4);                // fill window
                
        } while (ifOutside == false); // while loop to keep creating rectangular windows
    }
}
