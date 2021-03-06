package discountstrategy;

public class PercentOffDiscount implements Discount{
    private double percent;

    PercentOffDiscount(final double percent) {
        this.setPercent(percent);
    }

    @Override
    public final double calculateDiscount(int qty, double price) {
        if (qty < 0 || price < 0){
            throw new IllegalArgumentException("Input is not valid.");
        } else {
            return price * qty * percent;
        }
    }

    public final double getPercent() {
        return percent;
    }

    public final void setPercent(final double percent)  throws MandatoryEntryException{
        if(percent < 0){
            throw new IllegalArgumentException("Input is not valid.");
        }else{
            this.percent = percent;
        }
    }
}
