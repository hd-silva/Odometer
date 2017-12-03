package coe528.lab3;

/**
 *
 * @author h4silva
 */
public interface Counter {

    /**
     *The current value of this Counter as a String of digits.
     * @return value as String
     */
    String count();
    

    /**
     *Increments the counter
     */
    void increment();
    

    /**
     *Decrements the counter
     */
    void decrement();
    

    /**
     *Resets the counter
     */
    void reset();

}
