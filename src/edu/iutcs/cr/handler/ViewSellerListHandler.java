package edu.iutcs.cr.handler;

import edu.iutcs.cr.handler.util.MenuPrompt;
import edu.iutcs.cr.system.SystemDatabase;

public class ViewSellerListHandler implements MenuOperationHandler {
    private final SystemDatabase database;
    private final MenuPrompt menuPrompt;

    public ViewSellerListHandler() {
        this.database = SystemDatabase.getInstance();
        this.menuPrompt = MenuPrompt.getInstance();
    }

    @Override
    public void execute() {
        System.out.println("\n\nSeller's list");
        database.showSellerList();
        menuPrompt.promptViewMainMenu();
    }

    @Override
    public String getDescription() {
        return "View seller list";
    }
}
