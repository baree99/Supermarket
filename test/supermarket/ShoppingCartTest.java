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
public class ShoppingCartTest {
    
    public ShoppingCartTest() {
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
     * Test of addToCart method, of class ShoppingCart.
     */
    @Test
    public void testAddToCart1() {
        System.out.println("addToCart");
        String product = "Beans";
        Double amount = 1.00;
        Double expResult = amount;
        ShoppingCart instance = new ShoppingCart();
        instance.addToCart(product, amount);
        Double result = instance.products.get(product);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAddToCart2() {
        System.out.println("addToCart");
        String product = "Beans";
        Double amount = 1.00;
        Double expResult = amount + amount;
        ShoppingCart instance = new ShoppingCart();
        instance.addToCart(product, amount);
        instance.addToCart(product, amount);
        Double result = instance.products.get(product);
        assertEquals(expResult, result);
    }
    
}
