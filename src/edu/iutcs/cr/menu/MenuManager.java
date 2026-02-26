package edu.iutcs.cr.menu;

import edu.iutcs.cr.handler.*;

import java.util.HashMap;
import java.util.Map;

public class MenuManager {
    private final Map<Integer, MenuOperationHandler> operationHandlers;

    public MenuManager() {
        this.operationHandlers = new HashMap<>();
        initializeHandlers();
    }

    private void initializeHandlers() {
        operationHandlers.put(1, new AddSellerHandler());
        operationHandlers.put(2, new AddBuyerHandler());
        operationHandlers.put(3, new AddVehicleHandler());
        operationHandlers.put(4, new ViewInventoryHandler());
        operationHandlers.put(5, new ViewSellerListHandler());
        operationHandlers.put(6, new ViewBuyerListHandler());
        operationHandlers.put(7, new CreateOrderHandler());
        operationHandlers.put(8, new ViewInvoicesHandler());
    }

    public MenuOperationHandler getHandler(int operationCode) {
        return operationHandlers.get(operationCode);
    }

    public boolean hasHandler(int operationCode) {
        return operationHandlers.containsKey(operationCode);
    }

    public Map<Integer, MenuOperationHandler> getAllHandlers() {
        return new HashMap<>(operationHandlers);
    }
}
