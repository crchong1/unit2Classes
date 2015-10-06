import javax.swing.JFrame;
import java.util.Scanner;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeViewer
{
    // the cityscape will be animated for 60 seconds
    static final int ANIMATION_TIME_IN_SECONDS = 60;
   
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        frame.setSize(800 /* x */, 600 /* y */);
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Scanner prompt = new Scanner(System.in);
        System.out.println("How many floors do you want your buildings to be? ");
        int promptFloors = prompt.nextInt();

        System.out.println("Is it day or night? If day, then put true. If night, then put false. ");
        boolean ifDay = prompt.nextBoolean();
               
        
        
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        CityscapeComponent component = new CityscapeComponent(promptFloors, ifDay);
        frame.add(component);
        
        //  make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
        
        // animate the cityscape
        //for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
       // {
       //     component.nextFrame();
        //    Thread.sleep( 1000 );
       // }
        
    }
    
 

}
