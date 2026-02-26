package edu.iutcs.cr.handler;

import edu.iutcs.cr.handler.util.MenuPrompt;
import edu.iutcs.cr.system.SystemDatabase;

public class ViewInvoicesHandler implements MenuOperationHandler {
    private final SystemDatabase database;
    private final MenuPrompt menuPrompt;

    public ViewInvoicesHandler() {
        this.database = SystemDatabase.getInstance();
        this.menuPrompt = MenuPrompt.getInstance();
    }

    @Override
    public void execute() {
        System.out.println("\n\nInvoice list");
        database.showInvoices();
        menuPrompt.promptViewMainMenu();
    }

    @Override
    public String getDescription() {
        return "View all invoices";
    }
}
