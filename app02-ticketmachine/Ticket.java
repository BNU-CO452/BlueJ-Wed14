
/**
 * Write a description of class Ticket here.
 *
 * @author Derek Peacock
 * @version (a version number or a date)
 */
public class Ticket
{
    // Fields, attributes, variables
    
    private String destination;
    
    // This is the price of the ticket in pence
    private int price;
    
    /**
     * Constructor for objects of class Ticket
     * this method will set values for the fields
     */
    public Ticket(String destination, int price)
    {
        this.price = price;
        this.destination = destination;
    }

}
