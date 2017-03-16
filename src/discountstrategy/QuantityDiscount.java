package discountstrategy;

public class QuantityDiscount implements Discount{
    private double percent;
    private int quantity;

    QuantityDiscount(double percent, int quantity) {
        setPercent(percent);
        setQuantity(quantity);
    }
    
    @Override
    public final double calculateDiscount() {
        double discount = 0;
        if(quantity >= 5){
            discount = percent;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0){
            throw new IllegalArgumentException("Input is not valid.");
        }else{
            this.quantity = quantity;
        }
    }
}
