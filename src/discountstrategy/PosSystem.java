package discountstrategy;

public class PosSystem {
    private Receipt receipt;
    private OutputStrategy output;
    
    public PosSystem(OutputStrategy output){
        this.output = new ConsoleOutput();
    }

    public final void startTransaction(String storeId, String customerId, DataAccessStrategy dataAccessStrategy) {
        receipt = new Receipt(storeId, customerId, dataAccessStrategy);
    }

    /*
    Simulating real world display of items being added and output to video monitor
    */
    public final void addItemToTransaction(String productId, int productQuantity) {
        LineItem lineItem = receipt.addAndGetNewLineItem(productId, productQuantity);
        output = new ConsoleOutput();
        output.produceOutput(lineItem.getLineItem());
    }

    public final void endTransaction() {
        output = new ConsoleOutput();
        output.produceOutput(receipt.getReceipt());
    }
}
