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
public class PromotionsTest {
    
    public PromotionsTest() {
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
     * Test of threeForTwo method, of class Promotions.
     */
    @Test
    public void testThreeForTwo() {
        System.out.println("threeForTwo");
        Double quantity = 5.00;
        Double price = 0.50;
        Promotions instance = new Promotions();
        Double expResult = 0.50;
        Double result = instance.threeForTwo(quantity, price);
        assertEquals(expResult, result);
    }
    
}
