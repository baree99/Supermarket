/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author peterbarcsak
 */
public class PriceListTest {
    
    public PriceListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPrice method, of class PriceList.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        double weight = 0.20;
        PriceList instance = new PriceList();
        double expResult = 0.00;
        double result = instance.getPrice(weight);
        assertEquals(expResult, result, 0.0);
    }
    
}
