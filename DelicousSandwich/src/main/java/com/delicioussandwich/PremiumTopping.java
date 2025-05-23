package com.delicioussandwich;

/**
 * This Premium topping cost more and it depends on the sandwich size for exact price
 */
public class PremiumTopping implements Topping{
    private String toppingName;
    private boolean extraTopping;

    /**
     *
     * @param toppingName the name of the topping
     * @param extraTopping asks the customer if they want extra topping or not
     */
    public PremiumTopping(String toppingName, boolean extraTopping) {
        this.toppingName = toppingName;
        this.extraTopping = extraTopping;
    }

    @Override
    public String toppingName() {
        if(extraTopping == true){
            return toppingName + "extra premium topping";
        }
        else{
            return toppingName;
        }

    }

    @Override
    public double toppingPrice(String sandwichSize) {
        switch (sandwichSize){
            case "4":
                if (extraTopping == true){
                    return 1.50;
                }
                else {
                    return 1.00;
                }
            case "8":
                if(extraTopping == true){
                    return 3.00;
                }
                else{
                    return 2.00;
                }
            case "12":
                if(extraTopping == true){
                    return  4.50;
                }
                else{
                    return 3.00;
                }
            default:
                return 0.0;
        }
    }
}
