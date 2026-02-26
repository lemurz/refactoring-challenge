package edu.iutcs.cr.handler.util;

import edu.iutcs.cr.util.InputManager;

public class MenuPrompt {
    private static final MenuPrompt instance = new MenuPrompt();
    private final InputManager inputManager;

    private MenuPrompt() {
        this.inputManager = InputManager.getInstance();
    }

    public static MenuPrompt getInstance() {
        return instance;
    }

    public void promptViewMainMenu() {
        System.out.print("\n\nEnter 0 to view main menu: ");
        int val = -1;
        do {
            val = inputManager.readInt();
        } while (val != 0);
    }
}
