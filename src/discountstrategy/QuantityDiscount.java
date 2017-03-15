package discountstrategy;

public class QuantityDiscount implements Discount{

    @Override
    public final double calculateDiscount() {
        double discount = 0;
        if(quantity >= 5){
            discount = .1;
        }
        return discount;
    }
}
