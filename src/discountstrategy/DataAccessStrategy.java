package discountstrategy;

interface DataAccessStrategy {
    public abstract Store findStore(String storeId);
    
    public abstract Product findProduct(String productId);

    public abstract Customer findCustomer(String customerId);
    
}
