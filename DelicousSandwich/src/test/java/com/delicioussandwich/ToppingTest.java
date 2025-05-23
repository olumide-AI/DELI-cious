package com.delicioussandwich;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ToppingTest {

    @Test
    public void testThatRegularToppingWillAlwaysBeZero(){
        //Arrange - Create new Topping
        Topping topping = new RegularTopping("Spinach");
        //Act and Arrange
        assertEquals(0.0, topping.toppingPrice("4"));
        assertEquals(0.0, topping.toppingPrice("8"));
        assertEquals(0.0, topping.toppingPrice("12"));
    }

    @Test
    public void testPremiumToppingWithNormalPrice(){
        //Arrange - Create new Topping
        Topping topping = new PremiumTopping("Turkey", false);
        //Act and Arrange
        assertEquals(1.0, topping.toppingPrice("4"));
        assertEquals(2.0, topping.toppingPrice("8"));
        assertEquals(3.0, topping.toppingPrice("12"));
    }

    @Test
    public void testPremiumToppingWithExtraTopping(){
        //Arrange - Create new Topping
        Topping topping = new PremiumTopping("Turkey", true);
        //Act and Arrange
        assertEquals(1.50, topping.toppingPrice("4"));
        assertEquals(3.0, topping.toppingPrice("8"));
        assertEquals(4.50, topping.toppingPrice("12"));
    }

}
