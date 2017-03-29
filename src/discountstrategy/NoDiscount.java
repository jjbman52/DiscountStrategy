package discountstrategy;

public class NoDiscount implements Discount{

    @Override
    public double calculateDiscount(int qty, double price) {
        return 0;
    }
}
