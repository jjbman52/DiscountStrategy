package discountstrategy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {
    private Product instance;
    private String productId;
    private String productName;
    private double price;
    private Discount discount;
    
    public ProductTest() {
    }
    
    @Before
    public void setUp() {
        instance = new Product(productId, productName, price, discount);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetProductIdShouldNotAllowNull() {
        instance.setProductId(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetProductIdShouldNotAllowEmpty() {
        instance.setProductId("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProductNameShouldNotAllowNull() {
        instance.setProductName(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetProductNameShouldNotAllowEmpty() {
        instance.setProductName("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPriceShouldNotAllowLessThan0() {
        instance.setPrice(-1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetDiscountShouldNotBeNull() {
        instance.setDiscount(null);
    }
}
