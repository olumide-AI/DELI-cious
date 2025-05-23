package com.delicioussandwich;

/**
 * Topping is an option that can be added to any sandwich
 *Toppings have their own names and different prices based on the sie of the sandwich
 */
public interface Topping {
    String toppingName();

    /**
     *
     * @param sandwichSize is the size pf the sandwich and can be either ("4", "8", or "12")
     * @return the price: double
     */
    double toppingPrice(String sandwichSize);

}
