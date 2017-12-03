package coe528.lab3;

/**
 *
 * @author h4silva
 */
public abstract class AbstractCounter implements Counter{

    /**
     *Value of each odometer digit
     */
    protected int value;
    
    /**
     *Constructor
     * Sets value to 0
     */
    public AbstractCounter(){
        value = 0;
    }
    
    /**
     *Returns the odometer digit value
     * @return value
     */
    //Requires: A counter value
    //Modifies: None
    //Effects : Returns Counter value
    public int getValue(){return value;}
    
    /**
     *Sets the odometer digit value
     * @param s
     */
    //Requires: A counter value
    //Modifies: Counter value
    //Effects : Sets Counter value to input
    private void setValue(int s){value = s;}
}
