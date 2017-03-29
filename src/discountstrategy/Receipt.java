package discountstrategy;

public class Receipt {
    private DataAccessStrategy dataAccessStrategy;
    private Store store;
    private Customer customer;
    private LineItem[] lineItems;
    private OutputStrategy output;
    
    public Receipt(String storeId, String customerId, DataAccessStrategy dataAccessStrategy) {
        this.setDataAccessStrategy(dataAccessStrategy);
        lineItems = new LineItem[0];
        this.store = findStore(storeId);
        this.customer = findCustomer(customerId);
    }
    
    private final Store findStore(String storeId){
        if(storeId == null || storeId.isEmpty()){
            throw new IllegalArgumentException("Store ID is mandatory");
        }
        return dataAccessStrategy.findStore(storeId);
    }
    
    private final Customer findCustomer(String customerId){
        if(customerId ==  null || customerId.isEmpty()) {
            throw new IllegalArgumentException("Customer Id is mandatory");
        }
        return dataAccessStrategy.findCustomer(customerId);
    }
    
    public final LineItem addAndGetNewLineItem(final String productId, final int quantity){
        LineItem lineItem = new LineItem(productId, quantity, dataAccessStrategy);
        addToArray(lineItem);
        return lineItem;
    }
    
    private final void addToArray(final LineItem lineItem) {
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

    public final DataAccessStrategy getDataAccessStrategy() {
        return dataAccessStrategy;
    }

    public final void setDataAccessStrategy(final DataAccessStrategy dataAccessStrategy) {
        if(dataAccessStrategy == null){
            throw new IllegalArgumentException("DataAccessStrategy is not valid.");
        }else{
            this.dataAccessStrategy = dataAccessStrategy;
        }
    }
    
    private final String getColumnHeadings(){
        String headings = "ID       Item               Price     Quantity     Discount";
        return headings;
    }
    
    public final String getReceipt(){
        String data = "";
        data += store.getName();
        data += "Sold to: " + customer.getName();
        data += "Sold to: " + ((customer.getName() == null) ? "" : customer.getName());
        data += getColumnHeadings();
        return data;
    }
}
