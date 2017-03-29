package discountstrategy;

public class QuantityDiscount implements Discount {
    private double percent;
    private int minQty;


    public QuantityDiscount(double percent, int minQty) {
        setPercent(percent);
        setMinQty(minQty);
    }
    
    @Override
    public final double calculateDiscount(int qty, double price) {
        double discount = 0;
        if(qty >= minQty){
            discount = price * qty * percent;
        }
        return discount;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        if(percent < 0){
            throw new IllegalArgumentException("Input is not valid.");
        }else{
            this.percent = percent;
        }
    }

    public int getMinQty() {
        return minQty;
    }

    public void setMinQty(int minQty) {
        this.minQty = minQty;
    }

   
}
