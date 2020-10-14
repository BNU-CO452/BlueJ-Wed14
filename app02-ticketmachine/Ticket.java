import java.util.Date;

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
    
    // Date and time the ticket was issued
    private Date dateTime;
    
    /**
     * Constructor for objects of class Ticket
     * this method will set values for the fields
     */
    public Ticket(String destination, int price)
    {
        this.price = price;
        this.destination = destination;
        dateTime = new Date();
    }
    
    public void print()
    {
       System.out.print("Ticket to " + destination);
       System.out.print(" " + price + " pence ");
       System.out.println(" issued @ " + dateTime); 
    }

}
