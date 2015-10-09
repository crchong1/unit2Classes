import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;


/**
 * Creates a backdrop that is either black or blue
 * 
 * @Connor Chong  
 * @10-7-15 
 */
public class Backdrop
{
    /** String ifDay which is either day or night */
    private String ifDay;

    /**
     * Default constructor for objects of class Backdrop
     * @post initialises ifDay
     * @param String day which decides if Backdrop is blue or black
     */
    public Backdrop(String day)
    {
        // initialise ifDay
        this.ifDay = day;
    }

    /**
     * This method generates a backdrop of either blue or black, depending on the time of day.
     *
     * @pre        enter a String that is either day or night
     * @post       creates a black or blue rectangle
     * @param     ifDay   String that determines if day or night
     */
    public void drawBackdrop (Graphics2D g2)
    {
        if (ifDay.equals("day"))
        {
             Rectangle backdrop1 = new Rectangle(0, 0, 1500, 1100); // size of the viewer
             Color sky = new Color(135,206,235);                  // color code for sky blue
             g2.setColor(sky);                                    // color sky blue
             g2.fill(backdrop1);                                  // fill with blue
        }
        else 
        {
             Rectangle backdrop2 = new Rectangle(0, 0, 1500, 1100); // size of the viewer
             Color night = new Color (20,20,20); 
             g2.setColor(night);                                    // color black
             g2.fill(backdrop2);                                    // fill with black
        }
    }
}
