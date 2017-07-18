## Key problems to solve:
* Some products priced by unit, some by weight:
No differentiation needs to be made to calculate the sub-total, therefore I can calculate every product the same way, for example: coke ( 1 * 0.70), oranges (0.200 * 0.40)
* Structure to store the products the customer is going to buy
* Discounts on certain products:
Once a sub-total is calculated, the receipt needs to be checked for certain conditions, like someone bought 2 Coke, then calculate the total savings and finally deduct them

## Objects
```
Promotions -> CashRegister <- PriceList
    ShoppingCart -^
```
* Promotions is responsible for discounts
* PriceList is responsible for the price of each product
* ShoppingCart contains products the customer is going to buy
* CashRegister is calculating the total amount to pay

Java 8, NetBeans IDE and Junit are used to develop this program
