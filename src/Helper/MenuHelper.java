package src.Helper;

import java.util.InputMismatchException;
import java.util.Scanner;
import src.Canvas.Canvas;
import src.Models.Circle;
import src.Models.Rectangle;
import src.Models.Shape;
import src.Models.Square;

public class MenuHelper {
    private static final Scanner scanner = new Scanner(System.in);

    // ---- Menu ----
    public static void printMenu() {
        System.out.println("""
                -------------------------
                1) Add Circle
                2) Add Rectangle
                3) Add Square
                4) View Total Area
                5) Clear canvas
                6) Exit
                -------------------------""");
    }

    public static void addCircle(Canvas canvas) {
        double radius = readPositiveDouble("Enter radius (> 0): ");
        double thickness = readNonNegativeDouble("Enter border thickness (>= 0): ");
        Shape circle = new Circle(radius, thickness);
        canvas.addElement(circle);
        System.out.println("✔ Circle added.");
    }

    public static void addRectangle(Canvas canvas) {
        double w = readPositiveDouble("Enter width (> 0): ");
        double h = readPositiveDouble("Enter height (> 0): ");
        double thickness = readNonNegativeDouble("Enter border thickness (>= 0): ");
        Shape rect = new Rectangle(w, h, thickness);
        canvas.addElement(rect);
        System.out.println("✔ Rectangle added.");
    }

    public static void addSquare(Canvas canvas) {
        double side = readPositiveDouble("Enter side (> 0): ");
        double thickness = readNonNegativeDouble("Enter border thickness (>= 0): ");
        Shape square = new Square(side, thickness);
        canvas.addElement(square);
        System.out.println("✔ Square added.");
    }

    public static void showTotals(Canvas canvas) {
        double core = canvas.totalAreaWithoutBorders();
        double borders = canvas.totalBordersOnly();
        double including = canvas.totalIncludingBorders();

        System.out.printf("Total area WITHOUT borders: %.4f%n", core);
        System.out.printf("Total area of BORDERS only: %.4f%n", borders);
        System.out.printf("Total area INCLUDING borders: %.4f%n", including);
    }

    public static int readInt(String prompt) {
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

    public static double readPositiveDouble(String prompt) {
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

    public static double readNonNegativeDouble(String prompt) {
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