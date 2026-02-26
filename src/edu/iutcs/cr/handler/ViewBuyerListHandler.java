package edu.iutcs.cr.handler;

import edu.iutcs.cr.handler.util.MenuPrompt;
import edu.iutcs.cr.system.SystemDatabase;

public class ViewBuyerListHandler implements MenuOperationHandler {
    private final SystemDatabase database;
    private final MenuPrompt menuPrompt;

    public ViewBuyerListHandler() {
        this.database = SystemDatabase.getInstance();
        this.menuPrompt = MenuPrompt.getInstance();
    }

    @Override
    public void execute() {
        System.out.println("\n\nCustomer's list");
        database.showBuyerList();
        menuPrompt.promptViewMainMenu();
    }

    @Override
    public String getDescription() {
        return "View buyer list";
    }
}
