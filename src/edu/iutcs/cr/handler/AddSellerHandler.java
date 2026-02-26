package edu.iutcs.cr.handler;

import edu.iutcs.cr.handler.util.MenuPrompt;
import edu.iutcs.cr.persons.input.SellerInputBuilder;
import edu.iutcs.cr.system.SystemDatabase;

public class AddSellerHandler implements MenuOperationHandler {
    private final SystemDatabase database;
    private final MenuPrompt menuPrompt;

    public AddSellerHandler() {
        this.database = SystemDatabase.getInstance();
        this.menuPrompt = MenuPrompt.getInstance();
    }

    @Override
    public void execute() {
        System.out.println("\n\nAdd new seller");
        var seller = new SellerInputBuilder().buildSeller();
        database.getSellers().add(seller);
        menuPrompt.promptViewMainMenu();
    }

    @Override
    public String getDescription() {
        return "Add new seller";
    }
}
