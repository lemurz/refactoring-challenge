package edu.iutcs.cr.util;

import java.util.Scanner;

public class InputManager {
    private static final InputManager instance = new InputManager();
    private final Scanner scanner;

    private InputManager() {
        this.scanner = new Scanner(System.in);
    }

    public static InputManager getInstance() {
        return instance;
    }

    public int readInt() {
        return scanner.nextInt();
    }

    public String readString() {
        return scanner.next();
    }

    public String readLine() {
        return scanner.nextLine();
    }

    public int readIntInRange(int min, int max) {
        int value = -1;
        while (value < min || value > max) {
            System.out.print("Enter your choice: ");
            value = readInt();
            if (value < min || value > max) {
                System.out.println("Please enter a valid option!");
            }
        }
        return value;
    }

    public void close() {
        scanner.close();
    }
}
