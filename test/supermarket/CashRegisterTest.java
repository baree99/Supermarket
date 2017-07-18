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
public class CashRegisterTest {
    
    public CashRegisterTest() {
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
     * Test of calculateSubTotal method, of class CashRegister.
     */
    @Test
    public void testCalculateSubTotal1() {
        System.out.println("calculateSubTotal");
        CashRegister instance = new CashRegister();
        instance.addToCart("Beans", 3.0);
        Double expResult = 1.50;
        Double result = instance.calculateSubTotal();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateSubTotal2() {
        System.out.println("calculateSubTotal");
        CashRegister instance = new CashRegister();
        instance.addToCart("Beans", 3.0);
        instance.addToCart("Coke", 2.0);
        Double expResult = 2.90;
        Double result = instance.calculateSubTotal();
        assertEquals(expResult, result);
    }
    
}
