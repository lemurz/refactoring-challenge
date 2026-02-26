package edu.iutcs.cr;

import edu.iutcs.cr.handler.MenuOperationHandler;
import edu.iutcs.cr.menu.MenuManager;
import edu.iutcs.cr.system.SystemDatabase;
import edu.iutcs.cr.ui.UIFactory;
import edu.iutcs.cr.util.InputManager;

public class SystemFlowRunner {
    private final SystemDatabase database;
    private final MenuManager menuManager;
    private final InputManager inputManager;
    private final MainMenu mainMenu;

    public SystemFlowRunner() {
        this.database = SystemDatabase.getInstance();
        this.menuManager = UIFactory.createMenuManager();
        this.inputManager = InputManager.getInstance();
        this.mainMenu = UIFactory.createMainMenu();
    }

    public static void run() {
        SystemFlowRunner runner = new SystemFlowRunner();
        runner.startApplication();
    }

    private void startApplication() {
        System.out.println("Welcome to Car Hut");

        System.out.println("Loading existing system");
        System.out.println("Existing system loaded");

        while (true) {
            System.out.println("\n\n\n");

            int selectedOperation = mainMenu.showAndSelectOperation();

            if (selectedOperation == 9) {
                database.saveSystem();
                inputManager.close();
                return;
            }

            handleOperation(selectedOperation);
        }
    }

    private void handleOperation(int operationCode) {
        if (menuManager.hasHandler(operationCode)) {
            MenuOperationHandler handler = menuManager.getHandler(operationCode);
            handler.execute();
        } else {
            System.out.println("Invalid operation. Please try again.");
        }
    }
}
