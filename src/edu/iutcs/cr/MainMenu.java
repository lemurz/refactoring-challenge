package edu.iutcs.cr;

import edu.iutcs.cr.util.InputManager;

public class MainMenu {
    private static final MainMenu instance = new MainMenu();
    private final InputManager inputManager;

    private MainMenu() {
        this.inputManager = InputManager.getInstance();
    }

    public static MainMenu getInstance() {
        return instance;
    }

    private void showMenu() {
        System.out.println("Please enter the type of vehicle [1-9]: ");
        System.out.println("1. Add new seller");
        System.out.println("2. Add new customer");
        System.out.println("3. Add car");
        System.out.println("4. View inventory");
        System.out.println("5. View seller list");
        System.out.println("6. View buyer list");

        System.out.println();
        System.out.println("7. Add new order");
        System.out.println("8. View all invoices");

        System.out.println();
        System.out.println("9. Save System and Exit");
    }

    public int showAndSelectOperation() {
        showMenu();
        return inputManager.readIntInRange(1, 9);
    }
}
