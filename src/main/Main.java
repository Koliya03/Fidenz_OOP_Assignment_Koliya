package src.main;

import src.Canvas.Canvas;
import src.Helper.MenuHelper;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        boolean running = true;

        System.out.println("=== Shape Canvas ===");

        while (running) {
            MenuHelper.printMenu();
            int choice = MenuHelper.readInt("Choose an option: ");

            switch (choice) {
                case 1 -> MenuHelper.addCircle(canvas);
                case 2 -> MenuHelper.addRectangle(canvas);
                case 3 -> MenuHelper.addSquare(canvas);
                case 4 -> MenuHelper.showTotals(canvas);
                case 5 -> {
                    System.out.println("Clearing canvas...");
                    canvas.clear();
                }
                case 6 -> {
                    System.out.println("Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
            System.out.println();
        }
    }
}