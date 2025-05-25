package com.delicioussandwich;

public class Drink implements MenuItem{
    private String drinkName;
    private String drinkCupSize;
    private double drinkPrice;

    public Drink(String drinkName, String drinkCupSize, double drinkPrice) {
        this.drinkName = drinkName;
        this.drinkCupSize = drinkCupSize;
        this.drinkPrice = drinkPrice;
    }


    @Override
    public String menuItemName() {
        return drinkName;
    }

    @Override
    public double menuItemPrice() {
        return drinkPrice;
    }

    public String getDrinkCupSize() {
        return drinkCupSize;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "drinkName='" + drinkName + '\'' +
                ", drinkCupSize='" + drinkCupSize + '\'' +
                ", drinkPrice=" + drinkPrice +
                '}';
    }
}
