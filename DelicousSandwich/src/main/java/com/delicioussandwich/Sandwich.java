package com.delicioussandwich;

import java.util.ArrayList;
import java.util.List;

/**
 * A customize sandwich in our menu item, it has a bread with 3 different sandwich size
 * add toppings, confirm if you want a toast or not and 4 bread types.
 */
public class Sandwich implements MenuItem{
    private String sandwichSize;
    private String breadType;
    private boolean breadToasted;
    private List<Topping> toppingList = new ArrayList<>();

    /**
     *
     * @param sandwichSize lets user choose between size (4,8,0r 12)
     * @param breadType lets user choose between rye, wrap, white and wheat
     * @param breadToasted lets user choose between toasted or not
     */
    public Sandwich(String sandwichSize, String breadType, boolean breadToasted) {
        this.sandwichSize = sandwichSize;
        this.breadType = breadType;
        this.breadToasted = breadToasted;
    }

    /**
     *
     * @return The sandwich the user has choosen
     */
    @Override
    public String menuItemName() {
        String sandwichName = sandwichSize + "inches " + breadType + " sandwich.";
        if (breadToasted == true){
            sandwichName += " oven toasted. ";
        }
        return sandwichName;
    }

    /**
     *
     * @return the total price of the sandwich which is the bread choice and the toppings chosen
     */
    @Override
    public double menuItemPrice() {
        double regularBreadPrice = 0.0;
        if (sandwichSize.equalsIgnoreCase("4")){
            regularBreadPrice = 5.50;
        } else if (sandwichSize.equalsIgnoreCase("8")) {
            regularBreadPrice = 7.00;
        } else if (sandwichSize.equalsIgnoreCase("12")) {
            regularBreadPrice = 8.50;
        }
        else{
            regularBreadPrice = 0.0;
        }
        //Loop through topping list and find the total topping price
        double totalToppingPrice = 0.0;
        for(Topping topping: toppingList){
            totalToppingPrice += topping.toppingPrice(sandwichSize);
        }
        double totalSandwichPrice = regularBreadPrice + totalToppingPrice;
        return totalSandwichPrice;
    }

    /**
     *
     * @param topping adds individual toppings to the list of toppings
     */
    public void addTopping(Topping topping){
        toppingList.add(topping);
    }
}
