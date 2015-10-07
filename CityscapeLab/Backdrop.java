import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Creates a backdrop that is either black or blue
 * 
 * @Connor Chong (your name) 
 * @10-7-15 
 */
public class Backdrop
{
    /** boolean ifDay where true is day and false is night */
    private boolean ifDay;

    /**
     * Default constructor for objects of class Backdrop
     */
    public Backdrop(boolean day)
    {
        // initialise ifDay
        this.ifDay = day;
    }

    /**
     * This method generates a backdrop of either blue or black, depending on the time of day.
     *
     * @pre        enter a boolean that is either true or false
     * @post       creates a black or blue rectangle
     * @param    ifDay   boolean that determines if day or night
     */
    public void drawBackdrop (Graphics2D g2)
    {
        if (ifDay = true)
        {
             Rectangle backdrop1 = new Rectangle(0, 0, 900, 700); // size of the viewer
             Color sky = new Color(135,206,235);                  // color code for sky blue
             g2.setColor(sky);                                    // color sky blue
             g2.fill(backdrop1);                                  // fill with blue
        }
        else 
        {
             Rectangle backdrop2 = new Rectangle(0, 0, 900, 700); // size of the viewer
             g2.setColor(Color.BLACK);                            // color black
             g2.fill(backdrop2);                                  // fill with black
        }
    }
}
