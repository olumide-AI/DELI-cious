package com.delicioussandwich;
/**
 * This Topping is free regardless of size and or price
 */
public class RegularTopping implements Topping{
    private String toppingName;

    //Constructor to create a new topping
    public RegularTopping(String toppingName){
        this.toppingName = toppingName;
    }

    @Override
    public String toppingName() {
        return toppingName;
    }

    /**
     *
     * @param sandwichSize is the size 0f the sandwich and can be either ("4", "8", or "12")
     * @return 0.0
     */
    @Override
    public double toppingPrice(String sandwichSize) {
        return 0;
    }
}
