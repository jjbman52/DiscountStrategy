package discountstrategy;

public class PosSystem {
    private Receipt receipt;

    public final void startTransaction(String customerId, DataAccessStrategy dataAccessStrategy) {
         receipt = new Receipt(customerId, dataAccessStrategy);
    }

    public final void addItemToTransaction(String productId, double productQuantity) {
        receipt.addNewLineItem(productId, productQuantity);
    }

    public final void endTransaction() {
        
    }
}
