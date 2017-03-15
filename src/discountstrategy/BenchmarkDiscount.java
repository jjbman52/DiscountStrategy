package discountstrategy;

public class BenchmarkDiscount implements Discount{

    @Override
    public double calculateDiscount() {
        double discount = 0;
        if(totalAmount > 100 && totalAmount <= 150){
            discount = 10;
        } else if(totalAmount > 150 && totalAmount <= 200){
            discount = 25;
        } else if(totalAmount > 200){
            discount = 50;
        }
        return discount;
    }
    
}
