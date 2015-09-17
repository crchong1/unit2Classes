

/**
 * A Vending Machine
 * 
 * @author Connor Chong 
 * @version 9-17-15
 */
public class VendingMachine
{
    /** number of cans in the machine in units of cans */
    private int cans;
    
    /** number of tokens in the machine in units of tokens */
    private int tokens;
    
    /**
     * Default constructor for objects of class VendingMachine that specify the number of cans and tokens
     */
    public VendingMachine()
    {
        this.cans = 10;
    }
    
    /**
     * Default constructor for objects of class VendingMachine that specify the number of cans and tokens
     */
    public VendingMachine(int cans)
    {
        this.cans = 10;
        this.cans = cans;
    }
    
    
    /**
     * Fills the VendingMachine with more cans
     * @pre     cans >= 0 
     * @param   number of cans in the machine
     */
    public void fillUp(int fillCans)
    {
        cans = cans + fillCans;
    }

    /**
     * When you insert tokens into the machine
     *
     * @pre     cans > 0 
     * 
     */
    public void insertToken(int numberOfTokens)
    {
        tokens = tokens + numberOfTokens;
        cans = cans - numberOfTokens;
    }
    
    
    /**
     * Returns the number of cans in VendingMachine
     *
     * @return  Returns the number of cans in VendingMachine
     */
    public int getCanCount()
    {
        return cans;
    }   
    
     /**
     * Returns the number of tokens in VendingMachine
     *
     * @return  Returns the number of tokens in VendingMachine
     */
    public int getTokenCount()
    {
        return tokens;
    }
}
