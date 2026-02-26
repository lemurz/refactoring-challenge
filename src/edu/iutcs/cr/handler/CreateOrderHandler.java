package edu.iutcs.cr.handler;

import edu.iutcs.cr.Invoice;
import edu.iutcs.cr.ShoppingCart;
import edu.iutcs.cr.handler.util.OrderMenu;
import edu.iutcs.cr.persons.Buyer;
import edu.iutcs.cr.persons.Seller;
import edu.iutcs.cr.system.SystemDatabase;
import edu.iutcs.cr.util.InputManager;

public class CreateOrderHandler implements MenuOperationHandler {
    private final SystemDatabase database;
    private final InputManager inputManager;
    private final OrderMenu orderMenu;

    public CreateOrderHandler() {
        this.database = SystemDatabase.getInstance();
        this.inputManager = InputManager.getInstance();
        this.orderMenu = OrderMenu.getInstance();
    }

    @Override
    public void execute() {
        System.out.println("\n\nCreate order");
        ShoppingCart cart = new ShoppingCart();
        handleOrderOperations(cart);
    }

    @Override
    public String getDescription() {
        return "Create new order";
    }

    private void handleOrderOperations(ShoppingCart cart) {
        while (true) {
            orderMenu.displayOrderMenu();
            int selectedOperation = inputManager.readIntInRange(1, 5);

            switch (selectedOperation) {
                case 1 -> cart.addItem();
                case 2 -> cart.removeItem();
                case 3 -> cart.viewCart();
                case 4 -> {
                    createInvoice(cart);
                    return;
                }
                case 5 -> {
                    return;
                }
            }
        }
    }

    private void createInvoice(ShoppingCart cart) {
        Buyer buyer = selectBuyer();
        if (buyer == null) return;

        Seller seller = selectSeller();
        if (seller == null) return;

        Invoice invoice = new Invoice(buyer, seller, cart);
        invoice.printInvoice();
        database.getInvoices().add(invoice);
    }

    private Buyer selectBuyer() {
        Buyer buyer = null;
        do {
            System.out.print("Enter buyer id: ");
            String buyerId = inputManager.readLine();
            buyer = database.findBuyerById(buyerId);

            if (buyer == null) {
                System.out.println("Buyer not found. Try again!");
            }
        } while (buyer == null);
        return buyer;
    }

    private Seller selectSeller() {
        Seller seller = null;
        do {
            System.out.print("Enter seller id: ");
            String sellerId = inputManager.readLine();
            seller = database.findSellerById(sellerId);

            if (seller == null) {
                System.out.println("Seller not found. Try again!");
            }
        } while (seller == null);
        return seller;
    }
}
