package discountstrategy;

public class Product {
    private String productId;
    private String productName;
    private double price;
    
    public Product(String productId, String productName, double price){
        setProductId(productId);
        setProductName(productName);
        setPrice(price);
    }

    public final String getProductId() {
        return productId;
    }

    public final void setProductId(String productId) {
        this.productId = productId;
    }

    public final String getProductName() {
        return productName;
    }

    public final void setProductName(String productName) {
        this.productName = productName;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        this.price = price;
    }
}