package discountstrategy;

public class InMemoryDataStorage implements DataAccessStrategy{
    
    private Store[] stores = {
        new Store("12", "Kohl's", "1215 N West ST Milwaukee WI", "(444)444-4444", "headofsales@kohls.com"),
        new Store("13","Walmart","1756 N East ST Milwaukee WI","(555)555-5555","headofsales@walmart.com")
    };
    
    private Customer[] customers = {
        new Customer("100", "John Smith"),
        new Customer("200", "Sally Jones"),
        new Customer("300", "Bob Clementi")
    };
    
    
//    private Product[] products = {
//        new Product("A101", "MLB Brewer's Hat ", 19.95, new PercentOffDiscount(0.15)),
//        new Product("B205", "Men's Dress Shirt", 35.50, new QtyDiscount(.10,5)),
//        new Product("C222", "Women's Socks    ", 9.50, new NoDiscount())
//    };

    
    private Product[] products = {
        new Product("A101", "MLB Brewer's Hat ", 19.95, new PercentOffDiscount(0.15)),
        new Product("B205", "Men's Dress Shirt", 35.50, new QuantityDiscount(0.15,5)),
        new Product("B300", "Men's Belt", 35.50, new BenchmarkDiscount(5.00,70.00, 1000)),
        new Product("C222", "Women's Socks    ", 9.50, new NoDiscount())
    };
    
    @Override
    public final Store findStore(final String storeId) {
        // validation is needed for method parameter
        if(storeId == null || storeId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findStore method has "
                    + "illegal argument");
            return null;  // end method prematurely after log to console
        }
        
        Store store = null;
        for(Store s : stores) {
            if(storeId.equals(s.getStoreId())) {
                store = s;
                break;
            }
        }
        
        return store;
    }
    
    /**
     * Tries to find a Customer by customer id.
     * @param custId - must not be null or empty
     * @return found Customer or null if not found or bad argument
     */
    @Override
    public final Customer findCustomer(final String customerId) {
        // validation is needed for method parameter
        if(customerId == null || customerId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findCustomer method has "
                    + "illegal argument");
            return null;  // end method prematurely after log to console
        }
        
        Customer customer = null;
        for(Customer c : customers) {
            if(customerId.equals(c.getCustomerId())) {
                customer = c;
                break;
            }
        }
        
        return customer;
    }
    
    /**
     * Tries to find a Proudct by product id.
     * @param prodId - must not be null or empty
     * @return found Product or null if not found or bad argument
     */
    @Override
    public final Product findProduct(final String productId) {
        // validation is needed for method parameter
        if(productId == null || productId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findProduct method has "
                    + "illegal argument");
            return null;  // end method prematurely after log to console
        }
        
        Product product = null;
        for(Product p : products) {
            if(productId.equals(p.getProductId())) {
                product = p;
                break;
            }
        }
        
        return product;
    }
}