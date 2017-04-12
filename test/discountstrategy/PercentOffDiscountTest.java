package discountstrategy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class PercentOffDiscountTest {
    private PercentOffDiscount instance;
    
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
        // clean up after yourself!
        instance = null;
    }

    @Test
    public void testGetPercent() {
        
    }

    /**
     * Test of setPercent method, of class PercentOffDiscount.
     */
    @Test
    public void testSetPercent() {
        System.out.println("setPercent");
        double percent = 0.0;
        PercentOffDiscount instance = null;
        instance.setPercent(percent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
