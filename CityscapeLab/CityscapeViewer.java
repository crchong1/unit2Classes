import javax.swing.JFrame;
import java.util.Scanner;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @Connor Chong @gcschmit
 * @version 10-7-2015
 */
public class CityscapeViewer
{
    
    /** classVariable int  ANIMATION_CYCLES for the sun and moon animation*/
    static final int ANIMATION_CYCLES = 800;
   
    /**
     * main method for the program which creates and configures the frame for the program. The JFrame is also animated
     * @post creates a JFrame that objects can be drawn on
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        frame.setSize(900 /* x */, 700 /* y */);
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Scanner prompt = new Scanner(System.in);                                    // create Scanner prompt
        System.out.println("How many floors do you want your buildings to be? ");   // displays text
        int promptFloors = prompt.nextInt();                                        // gets floors from keyboard

        System.out.println("Is it day or night? ");                                 // displays text
        String ifDay = prompt.next();                                               // gets ifDay from keyboard
              
        // a frame contains a single component; create the Cityscape component and add it to the frame
        CityscapeComponent component = new CityscapeComponent(promptFloors, ifDay);
        frame.add(component);
        
        //  make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
        
        // animate the cityscape
        int increment = 1;
        for( int instances = 0; instances < ANIMATION_CYCLES; instances++ ) // for loop to animate the cityscape
        {
            component.nextFrame(increment);        // passes the increment value to the component
            Thread.sleep( 10 );                    // delay of 10 miliseconds between each instance
            increment = increment + 1;             // increments the increment
        }
    }
}
