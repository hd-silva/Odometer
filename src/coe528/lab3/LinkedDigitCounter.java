package coe528.lab3;

/**
 *
 * @author h4silva
 */
public class LinkedDigitCounter extends AbstractCounter{
    private Counter leftNeighbor;
    
    /**
     *Constructor: sets the Linked Digit Counter's left neighbor
     * @param leftNeighbor
     */
    public LinkedDigitCounter(Counter leftNeighbor){
        this.leftNeighbor = leftNeighbor;
    }
    
    //Requires: A counter value, and a Left Neighbor
    //Modifies: Counter value
    //Effects : Increments counter value by 1, or change it to 0
    //          after 9, and carry out the remaining 1 to Left Neighbour
    @Override
    public void increment(){
        if (value < 9){
            value = value + 1;
        }
        
        else {
            value = 0;
            leftNeighbor.increment();
        }
    }
    
    //Requires: A counter value, and a Left Neighbor
    //Modifies: Counter value
    //Effects : Decrements counter value by 1, or change it to 9
    //          after 0, and carry decrement the Left Neighbour
    @Override
    public void decrement(){
       if (value > 0)
        value = value - 1;
       
       else {
        value = 9;
        leftNeighbor.decrement();
       } 
    }
    
    //Requires: A counter value, and a Left Neighbor
    //Modifies: Counter value
    //Effects : Set counter value to 0, and do the same for the
    //          Left Neighbour
    @Override
    public void reset(){
        value = 0;
        leftNeighbor.reset();
    }
    
    //Requires: A counter value, and a Left Neighbor
    //Modifies: None
    //Effects : Get the Left Neighbor value in String format,
    //          concatonate it with own value and return result
    @Override
    public String count(){
    return "" + leftNeighbor.count() + value;
    }
}
