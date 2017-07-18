/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.util.Map;

/**
 *
 * @author peterbarcsak
 */
public class CashRegister {
    
    ShoppingCart shoppingCart;
    PriceList priceList;

    public CashRegister() {
        this.shoppingCart = new ShoppingCart();
        this.priceList = new PriceList();
    }
    
    public Double calculateSubTotal() {
        Double subTotal = 0.00;
        for (Map.Entry<String, Double> entry : shoppingCart.products.entrySet()) {
            String product = entry.getKey();
            Double quantity = entry.getValue();
        subTotal += priceList.getUnitPrice(product) * quantity;
    }
        return subTotal;
    }
    
    public void addToCart(String product, Double quantity) {
        shoppingCart.addToCart(product, quantity);
    }
}
