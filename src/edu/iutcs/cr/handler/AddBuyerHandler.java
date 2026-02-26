package edu.iutcs.cr.handler;

import edu.iutcs.cr.handler.util.MenuPrompt;
import edu.iutcs.cr.persons.input.BuyerInputBuilder;
import edu.iutcs.cr.system.SystemDatabase;

public class AddBuyerHandler implements MenuOperationHandler {
    private final SystemDatabase database;
    private final MenuPrompt menuPrompt;

    public AddBuyerHandler() {
        this.database = SystemDatabase.getInstance();
        this.menuPrompt = MenuPrompt.getInstance();
    }

    @Override
    public void execute() {
        System.out.println("\n\nAdd new customer");
        var buyer = new BuyerInputBuilder().buildBuyer();
        database.getBuyers().add(buyer);
        menuPrompt.promptViewMainMenu();
    }

    @Override
    public String getDescription() {
        return "Add new customer";
    }
}
