package discountstrategy;

public class FlatRateDiscount implements Discount{

    @Override
    public double calculateDiscount() {
        double discount = 0;
        if(storeWideSale = true){
            discount = storeWideDiscount;
        }
        return discount;
    }
    
}
