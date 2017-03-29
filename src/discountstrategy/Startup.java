package discountstrategy;

public class Startup {

    public static void main(String[] args) {
        DataAccessStrategy dataAccessStrategy = new InMemoryDataStorage();
        OutputStrategy output = new ConsoleOutput();
        
        PosSystem pos = new PosSystem(output);
        pos.startTransaction("12", "100", dataAccessStrategy);
        pos.addItemToTransaction("A101", 1);
        pos.addItemToTransaction("B205", 2);
        pos.endTransaction();
    }
}
