package src.Helper;

import java.util.InputMismatchException;
import java.util.Scanner;

import src.Models.Elephant;
import src.Models.Fish;
import src.Models.Parrot;
import src.Models.Seabird;
import src.Zoo.Zoo;

public class ZooHelper {
    private static final Scanner scanner = new Scanner(System.in);

    public static void printMenu() {
        System.out.println("""
                -------------------------------
                1)  Add Elephant
                2)  Add Fish
                3)  Add SeaBird
                4)  Add Parrot
                5)  Show counts (total, swimmers, walkers, flyers)
                6)  Feed all animals
                7)  Put all animals to sleep
                8)  Wake all animals
                9)  Make all swimmers swim
                10) Make all flyers fly
                11) Make all walkers walk
                12) Clear zoo
                13) Exit
                -------------------------------""");
    }

    public static void addElephant(Zoo zoo) {
        zoo.addAnimal(new Elephant());
        System.out.println("Elephant added.");
    }

    public static void addFish(Zoo zoo) {
        zoo.addAnimal(new Fish());
        System.out.println("Fish added.");
    }

    public static void addSeaBird(Zoo zoo) {
        zoo.addAnimal(new Seabird());
        System.out.println("SeaBird added.");
    }

    public static void addParrot(Zoo zoo) {
        zoo.addAnimal(new Parrot());
        System.out.println("Parrot added.");
    }

    public static void showCounts(Zoo zoo) {
        System.out.println("Total animals : " + zoo.countAll());
        System.out.println("Swimmers      : " + zoo.countSwimmers());
        System.out.println("Walkers       : " + zoo.countWalkers());
        System.out.println("Flyers        : " + zoo.countFlyers());
    }

    public static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                String line = scanner.nextLine().trim();
                return Integer.parseInt(line);
            } catch (NumberFormatException | InputMismatchException ex) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }
}
