package discountstrategy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class PercentOffDiscountTest {
    private PercentOffDiscount instance;
    private double percent;
    
    public PercentOffDiscountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        instance = new PercentOffDiscount(percent);
    }
    
    @After
    public void tearDown() {
        instance = null;
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculateDiscountIfEitherPriceOrQuantityIsLessThan0() {
        instance.calculateDiscount(-1, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPercentIfLessThan0() {
        instance.setPercent(-1);
    }
}
