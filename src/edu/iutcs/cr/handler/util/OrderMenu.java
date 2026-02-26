package edu.iutcs.cr.handler.util;

public class OrderMenu {
    private static final OrderMenu instance = new OrderMenu();

    private OrderMenu() {
    }

    public static OrderMenu getInstance() {
        return instance;
    }

    public void displayOrderMenu() {
        System.out.println("Please enter the type of operation: [1-5]");
        System.out.println("1. Add new vehicle to cart");
        System.out.println("2. Remove vehicle from cart");
        System.out.println("3. View cart");
        System.out.println("4. Confirm purchase");
        System.out.println("5. Return to main menu");
        System.out.println();
    }
}
