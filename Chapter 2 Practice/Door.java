

/**
 * Here is a door
 * 
 * @author Connor Chong 
 * @version 9-15-15
 */
public class Door
{
    /** Specifies the door name in a String */
    private String doorName;
    
    /** Specifies the state of the door in a boolean. If true, then open. If false, then closed */
    private boolean doorState;
    
    /**
     * Default constructor for objects of class Door
     */
    public Door(String methodDoorName, boolean methodDoorState)
    {
        doorName = methodDoorName;
        doorState = methodDoorState;
        
                
        if (doorState = true)
        {
            String finalState = "open";
        }    
        else
        {
            String finalState = "closed";
        }
    }    
    
    
   
    /**
     * Change the door's state to closed
     *
     * @pre        Can be open or closed
     *            
     * @post       Must be closed
     * @param     state of the doorState
     */
    public void close (boolean closeDoorState)
    {
        if (closeDoorState = true)
        {
            closeDoorState = false;
        }    
    }
    
    
    /**
     * Change the door's state to open
     *
     * @pre        Can be open or closed
     *            
     * @post       Must be open
     * @param     state of the doorState
     */
    public void open (boolean closeDoorState)
    {
        if (closeDoorState = false)
        {
            closeDoorState = true;
        }    
    }
    
    
    
    
    

}
