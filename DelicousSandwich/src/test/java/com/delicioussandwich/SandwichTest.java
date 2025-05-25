package com.delicioussandwich;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for the sandwich class testing the base price and multiple topping calculations scenarios
 */
public class SandwichTest {
    @Test
    public void basicSandwichTest(){
        //Arrange
        Sandwich sandwich = new Sandwich("4", "white", false);

        //Act
        double sandwichPrice = sandwich.menuItemPrice();

        //Assert
        assertEquals(5.50, sandwichPrice, 0.001);
    }
    @Test
    public void basicSandwichWithRegularToppingTest(){
        //Arrange
        Sandwich sandwich = new Sandwich("4", "white", false);
        sandwich.addTopping(new RegularTopping("Avocado"));

        //Act
        double sandwichPrice = sandwich.menuItemPrice();

        //Assert
        assertEquals(5.50, sandwichPrice, 0.001);
    }
    @Test
    public void basicSandwichWithPremiumToppingTest(){
        //Arrange
        Sandwich sandwich = new Sandwich("4", "white", false);
        sandwich.addTopping(new PremiumTopping("Beef", false));

        //Act
        double sandwichPrice = sandwich.menuItemPrice();

        //Assert
        assertEquals(6.50, sandwichPrice, 0.001);
    }

    @Test
    public void basicSandwichWithExtraPremiumToppingTest(){
        //Arrange
        Sandwich sandwich = new Sandwich("4", "white", false);
        sandwich.addTopping(new PremiumTopping("Steak", true));

        //Act
        double sandwichPrice = sandwich.menuItemPrice();

        //Assert
        assertEquals(7.00, sandwichPrice, 0.001);
    }

    @Test
    public void basicSandwichWithAnotherPremiumToppingTest(){
        //Arrange
        Sandwich sandwich = new Sandwich("12", "white", false);
        sandwich.addTopping(new PremiumTopping("Steak", true));

        //Act
        double sandwichPrice = sandwich.menuItemPrice();

        //Assert
        assertEquals(9.00, sandwichPrice, 0.001);
    }

}
