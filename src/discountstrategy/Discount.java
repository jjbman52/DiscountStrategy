package discountstrategy;

public interface Discount {
    public abstract double calculateDiscount(int qty, double price);
}
