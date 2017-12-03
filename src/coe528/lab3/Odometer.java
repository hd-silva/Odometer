package coe528.lab3;

/**
 *
 * @author h4silva
 */
public class Odometer implements Counter{
    private int size = 0;
    private Counter[] ldc;
   // private DigitCounter dc;
    
    /**
     *Constructor: Builds an odometer using an array of type
     * Counter. Throws exception if odometer size is less than 1
     * @param size
     */
    public Odometer(int size){
        if(size<1)
            throw new IllegalArgumentException();
        this.size = size;
        
        ldc = new Counter[size];
        ldc[0] = new DigitCounter();
        for(int i=1; i<size; i++){
                ldc[i] = new LinkedDigitCounter(ldc[i-1]);
            }
    }
    
    //Requires: An Counter[] of length = size-1
    //Modifies: For each counter, adds 1 to value
    //Effects : Increments Odometer
    @Override
    public void increment(){
        ldc[size-1].increment();
    }
    
    //Requires: An Counter[] of length = size-1
    //Modifies: For each counter, subtracts 1 from value
    //Effects : Decrements Odometer
    @Override
    public void decrement(){
        ldc[size-1].decrement();
    }
    
    //Requires: An Counter[] of length = size-1
    //Modifies: For each counter, makes value 0
    //Effects : Sets the Odometer value to 00..
    @Override
    public void reset(){
        ldc[size-1].reset();
    }
    
    //Requires: An Counter[] of length = size-1
    //Modifies: None
    //Effects : Return Odometer value as a String
    @Override
    public String count(){
    return ldc[size-1].count();
    }
    
}