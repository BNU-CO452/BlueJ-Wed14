import java.util.Random;

/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    private Random generator;
    
    private String name = "Samsung Galaxy S20";
    
    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        generator = new Random();
        this.manager = manager;
        
        manager.addProduct(new Product(101, "Samsung Galaxy S20"));
        manager.addProduct(new Product(102, "Apple iPhone 12"));
        manager.addProduct(new Product(103, "Google Pixel 4A"));
        manager.addProduct(new Product(104, "Samsung Galaxy S20"));
        manager.addProduct(new Product(105, "Apple iPhone 12"));
        manager.addProduct(new Product(106, "Google Pixel 4A"));
        manager.addProduct(new Product(107, "Samsung Galaxy S20"));
        manager.addProduct(new Product(108, "Apple iPhone 11"));
        manager.addProduct(new Product(109, "Google Pixel 3A"));        
        manager.addProduct(new Product(110, "Google Pixel 2A"));        
    }
    
    /**
     * Provide a demonstration of how a StockManager
     * might be used. It will demonstrate delivering 
     * various quantities of stock for all 10 products
     * Sell various quantitites of stock for all 10 products
     */
    public void runDemo()
    {
        boolean found = name.startsWith("Samsung");
        System.out.println(found);
        
        manager.printAllStock();
        demoDelivery();
        demoSell();
    }
    
    private void demoDelivery()
    {
        int quantity = 0;
        
        for(int id = 101; id <= 110; id++)
        {
            quantity = generator.nextInt(8);
            manager.deliverProduct(id, quantity);
        }
        
        manager.printAllStock();
    }
    
    private void demoSell()
    {
        int quantity = 0;
        
        for(int id = 101; id <= 110; id++)
        {
            quantity = generator.nextInt(8);
            manager.sellProduct(id, quantity);
        }
        
        manager.printAllStock();        
    }
    
    
    
}
