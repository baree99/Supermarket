/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

/**
 *
 * @author peterbarcsak
 */
public class Promotions {
    
    public Double threeForTwo(Double quantity, Double price) {
        return Math.floor(quantity / 3) * price;
    }
    
    public Double twoForOnePound() {
        return 0.0;
    }
}
