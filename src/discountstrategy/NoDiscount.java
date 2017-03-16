package discountstrategy;

public class NoDiscount implements Discount{

    @Override
    public double calculateDiscount() {
        return 0;
    }
    
}
