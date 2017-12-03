package coe528.lab3;

/**
 *
 * @author h4silva
 */
public class DigitCounter extends AbstractCounter{
    
    //Requires: A counter value
    //Modifies: Counter value
    //Effects : Increments counter value by 1, or change it to 0 if 9
    @Override
    public void increment(){
       if (value < 9){
            value = value + 1;
       }
        else {
            value = 0;
        } 
    }
    
    //Requires: A counter value
    //Modifies: Counter value
    //Effects : Decrements counter value by 1, or change it to 9 if 0
    @Override
    public void decrement(){
        if (value > 0)
        value = value - 1;
       
       else {
        value = 9;
       }
    }
    
    //Requires: A counter value
    //Modifies: Counter value
    //Effects : Set counter value to 0
    @Override
    public void reset(){
        value = 0;
    }
    
    //Requires: A counter value
    //Modifies: None
    //Effects : Return value as String
    @Override
    public String count(){
    return "" + value;
    }
}
