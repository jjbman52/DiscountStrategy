package discountstrategy;

public class Receipt {
    private DataAccessStrategy dataAccessStrategy;
    private Customer customer;
    private LineItem[] lineItems;
    
    public Receipt(String customerId, DataAccessStrategy dataAccessStrategy) {
        
    }
    
    private final Customer findCustomer(String customerId, DataAccessStrategy dataAccessStrategy){
        return dataAccessStrategy.findCustomer(customerId);
    }
    
    private final void addNewLineItem(String productId, int quantity){
        LineItem lineItem = new LineItem(productId, quantity, dataAccessStrategy);
    }
}
