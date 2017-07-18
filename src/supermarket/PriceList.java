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
public class PriceList {
    
    public final HashMap<String, Double> productPrices;

    public PriceList() {
        this.productPrices = new HashMap<String, Double>() {{
            put("Beans", 0.50);
            put("Coke", 0.70);
            put("Oranges", 1.99);
        }};
    }

    
    /**
     *
     * @param product
     * @return
     */
    public double getUnitPrice(String product) {
       return productPrices.get(product); 
    }
    
}
