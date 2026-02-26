package edu.iutcs.cr.handler;

import edu.iutcs.cr.handler.util.MenuPrompt;
import edu.iutcs.cr.system.SystemDatabase;

public class ViewInventoryHandler implements MenuOperationHandler {
    private final SystemDatabase database;
    private final MenuPrompt menuPrompt;

    public ViewInventoryHandler() {
        this.database = SystemDatabase.getInstance();
        this.menuPrompt = MenuPrompt.getInstance();
    }

    @Override
    public void execute() {
        System.out.println("\n\nInventory list");
        database.showInventory();
        menuPrompt.promptViewMainMenu();
    }

    @Override
    public String getDescription() {
        return "View inventory";
    }
}
