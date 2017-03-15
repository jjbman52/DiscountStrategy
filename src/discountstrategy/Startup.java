package discountstrategy;

public class Startup {

    public static void main(String[] args) {
        DataAccessStrategy dataAccessStrategy = new DataAccessStrategy();
        PosSystem pos = new PosSystem();
        pos.startTransaction("", dataAccessStrategy);
        pos.addItemToTransaction("A212", 1);
        pos.addItemToTransaction("D525", 2);
        pos.endTransaction();
    }
}
