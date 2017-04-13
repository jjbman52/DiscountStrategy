package discountstrategy;

public class Product {
    private String productId;
    private String productName;
    private double price;
    private Discount discount;
    
    public Product(String productId, String productName, double price, Discount discount){
        this.setProductId(productId);
        this.setProductName(productName);
        this.setPrice(price);
        this.setDiscount(discount);
    }

    public final String getProductId() {
        return productId;
    }

    public final void setProductId(String productId) throws MandatoryEntryException{
        if(productId == null || productId.isEmpty()){
            throw new IllegalArgumentException("Input is not valid.");
        }else{
            this.productId = productId;
        }
    }

    public final String getProductName() {
        return productName;
    }

    public final void setProductName(String productName) throws MandatoryEntryException{
        if(productName == null || productName.isEmpty()){
            throw new IllegalArgumentException("Input is not valid.");
        }else{
            this.productName = productName;
        }
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(double price) throws MandatoryEntryException{
        if(price < 0){
            throw new IllegalArgumentException("Input is not valid.");
        }else{
            this.price = price;
        }
    }

    public final Discount getDiscount() throws MandatoryEntryException{
        return discount;
    }

    public final void setDiscount(Discount discount) {
        if(discount == null){
            throw new IllegalArgumentException("Input is not valid.");
        }else{
            this.discount = discount;
        }
    }
}
