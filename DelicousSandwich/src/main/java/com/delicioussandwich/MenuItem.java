package com.delicioussandwich;

/**
 * Menu item is the available options available for the resturant, they can be
 * choosen has part of an order. They return the item name and price.
 */
public interface MenuItem {

    String menuItemName();
    double menuItemPrice();
}
