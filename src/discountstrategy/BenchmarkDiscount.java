package discountstrategy;

public class BenchmarkDiscount implements Discount{
    private double discountAmt;
    private double minAmtPurchased;
    private double maxAmtPurchased;
    
    public BenchmarkDiscount(double discountAmt, double minAmtPurchased, double maxAmtPurchased){
        setDiscountAmt(discountAmt);
        setMinAmtPurchased(minAmtPurchased);
        setMaxAmtPurchased(maxAmtPurchased);
    }

    @Override
    public double calculateDiscount(int qty, double price) {
        double discount = 0;
        
        double subtotalBeforeDiscount = price * qty;
        if(subtotalBeforeDiscount >= minAmtPurchased && subtotalBeforeDiscount <= maxAmtPurchased) {
            discount = discountAmt;
        }
        return discount;
    }

    public double getDiscountAmt() {
        return discountAmt;
    }

    public final void setDiscountAmt(double discountAmt) {
        if(discountAmt < 0){
            throw new IllegalArgumentException("Input is not valid.");
        }else{
            this.discountAmt = discountAmt;
        }
    }

    public final double getMinAmtPurchased() {
        return minAmtPurchased;
    }

    public final void setMinAmtPurchased(double minAmtPurchased) {
        this.minAmtPurchased = minAmtPurchased;
    }

    public final double getMaxAmtPurchased() {
        return maxAmtPurchased;
    }

    public final void setMaxAmtPurchased(double maxAmtPurchased) {
        this.maxAmtPurchased = maxAmtPurchased;
    }
}
