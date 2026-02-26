package edu.iutcs.cr.ui;

import edu.iutcs.cr.MainMenu;
import edu.iutcs.cr.menu.MenuManager;

public class UIFactory {

    public static MenuManager createMenuManager() {
        return new MenuManager();
    }

    public static MainMenu createMainMenu() {
        return MainMenu.getInstance();
    }
}