package discountstrategy;

public class Receipt {
    private DataAccessStrategy dataAccessStrategy;
    private Customer customer;
    private LineItem[] lineItems;
    private OutputStrategy output;
    
    public Receipt(String customerId, DataAccessStrategy dataAccessStrategy) {
        this.setDataAccessStrategy(dataAccessStrategy);
        lineItems = new LineItem[0];
        this.customer = findCustomer(customerId);
    }
    
    private Customer findCustomer(String customerId){
        return dataAccessStrategy.findCustomer(customerId);
    }
    
    public final void addNewLineItem(String productId, int quantity){
        LineItem lineItem = new LineItem(productId, quantity, dataAccessStrategy);
        addToArray(lineItem);
    }
    
    private void addToArray(final LineItem lineItem) {
        // needs validation
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = lineItem;
        lineItems = tempItems;
        tempItems = null;
    }
    
    public final double getTotalDiscountAmount(){
        double total = 0.0;
        for(LineItem lineItem : lineItems){
            total += lineItem.getDiscountAmount();
        }
        return total;
    }

    public DataAccessStrategy getDataAccessStrategy() {
        return dataAccessStrategy;
    }

    public void setDataAccessStrategy(DataAccessStrategy dataAccessStrategy) {
        if(dataAccessStrategy == null){
            throw new IllegalArgumentException("DataAccessStrategy is not valid.");
        }else{
            this.dataAccessStrategy = dataAccessStrategy;
        }
    }
}
