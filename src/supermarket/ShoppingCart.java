/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.util.HashMap;

/**
 *
 * @author peterbarcsak
 */
public class ShoppingCart {
    
    public final HashMap<String, Double> products;

    public ShoppingCart() {
        this.products = new HashMap<>();
    }
    
    public void addToCart(String product, Double amount) {
        if ( products.containsKey(product) ) {
            products.put(product, products.get(product) + amount);
        } else {
            products.put(product, amount);
        }
    }
}
