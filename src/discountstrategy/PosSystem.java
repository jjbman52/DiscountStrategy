package discountstrategy;

public class PosSystem {
    private LineItem lineItem;
    private Receipt receipt;
    private OutputStrategy output;
    
    public PosSystem(OutputStrategy output){
        this.output = new ConsoleOutput();
    }

    public final void startTransaction(String customerId, DataAccessStrategy dataAccessStrategy) {
         receipt = new Receipt(customerId, dataAccessStrategy);
         output = new ConsoleOutput();
    }

    public final void addItemToTransaction(String productId, int productQuantity) {
        receipt.addNewLineItem(productId, productQuantity);
        //output.produceOutput(lineItem.getLineItem());
    }

    public final void endTransaction() {
        
    }
}
