package src.main;

import src.Canvas.Canvas;
import src.Models.Circle;
import src.Models.Rectangle;
import src.Models.Shape;
import src.Models.Square;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        boolean running = true;

        System.out.println("=== Shape Canvas ===");
        while (running) {
            printMenu();
            int choice = readInt("Choose an option: ");

            switch (choice) {
                case 1 -> addCircle(canvas);
                case 2 -> addRectangle(canvas);
                case 3 -> addSquare(canvas);
                case 4 -> showTotals(canvas);
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

    private static void printMenu() {
        System.out.println("""
                -------------------------
                1) Add Circle
                2) Add Rectangle
                3) Add Square
                4) View total Area
                5) Clear canvas
                6) Exit
                -------------------------""");
    }

    private static void addCircle(Canvas canvas) {
        double radius = readPositiveDouble("Enter radius (> 0): ");
        double thickness = readNonNegativeDouble("Enter border thickness (>= 0): ");
        Shape circle = new Circle(radius, thickness);
        canvas.addElement(circle);
        System.out.println("Circle added successfully.");
    }

    private static void addRectangle(Canvas canvas) {
        double w = readPositiveDouble("Enter width (> 0): ");
        double h = readPositiveDouble("Enter height (> 0): ");
        double thickness = readNonNegativeDouble("Enter border thickness (>= 0): ");
        Shape rect = new Rectangle(w, h, thickness);
        canvas.addElement(rect);
        System.out.println(" Rectangle added successfully.");
    }

    private static void addSquare(Canvas canvas) {
        double side = readPositiveDouble("Enter side (> 0): ");
        double thickness = readNonNegativeDouble("Enter border thickness (>= 0): ");
        Shape square = new Square(side, thickness);
        canvas.addElement(square);
        System.out.println(" Square added successfully.");
    }

    private static void showTotals(Canvas canvas) {
        double withoutBorders = canvas.totalAreaWithoutBorders();
        double borders = canvas.totalBordersOnly();
        double including = canvas.totalIncludingBorders();

        System.out.printf("Total area WITHOUT borders: ", withoutBorders);
        System.out.printf("Total area of BORDERS only: ", borders);
        System.out.printf("Total area INCLUDING borders: ", including);
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                String line = scanner.nextLine().trim();
                return Integer.parseInt(line);
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    private static double readPositiveDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                String line = scanner.nextLine().trim();
                double v = Double.parseDouble(line);
                if (v > 0)
                    return v;
                System.out.println("Value must be > 0.");
            } catch (NumberFormatException | InputMismatchException ex) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    private static double readNonNegativeDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                String line = scanner.nextLine().trim();
                double v = Double.parseDouble(line);
                if (v >= 0)
                    return v;
                System.out.println("Value must be >= 0.");
            } catch (NumberFormatException | InputMismatchException ex) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}
