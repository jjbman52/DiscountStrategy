package discountstrategy;

public class LineItem {
    private Product product;
    private int quantity;

    public LineItem(String productId, int quantity, DataAccessStrategy dataAccessStrategy) {
        setProduct(findProduct(productId, dataAccessStrategy));
        this.quantity = quantity;
    }
    
    private Product findProduct(String productId, DataAccessStrategy dataAccessStrategy){
        return dataAccessStrategy.findProduct(productId);
    }

    public final String getLineItem(){
        String line;
        
        line =
        getProduct().getProductName() + "    " + getProduct().getProductId() + "    " + getProduct().getPrice() + "    " + getDiscountAmount();
        
        return line;
    }

    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        if(product == null){
            throw new IllegalArgumentException("Product is not valid.");
        }else{
            this.product = product;
        }
    }
    
    public final double getDiscountAmount(){
        double discountAmount;
        discountAmount = getProduct().getDiscount().calculateDiscount(quantity,product.getPrice());
        return discountAmount;
    }

    public final int getQuantity() {
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
