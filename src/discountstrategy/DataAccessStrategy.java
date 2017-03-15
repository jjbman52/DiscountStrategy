package discountstrategy;

interface DataAccessStrategy {
    public abstract Product findProduct(String productId);

    public abstract Customer findCustomer(String customerId);
    
}
