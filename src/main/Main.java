package src.main;

import src.Helper.ZooHelper;
import src.Zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        boolean running = true;

        System.out.println("=== Zoo Simulation ===");

        while (running) {
            ZooHelper.printMenu();
            int choice = ZooHelper.readInt("Choose an option: ");

            switch (choice) {
                case 1 -> ZooHelper.addElephant(zoo);
                case 2 -> ZooHelper.addFish(zoo);
                case 3 -> ZooHelper.addSeaBird(zoo);
                case 4 -> ZooHelper.addParrot(zoo);
                case 5 -> ZooHelper.showCounts(zoo);
                case 6 -> zoo.feedAll();
                case 7 -> zoo.sleepAll();
                case 8 -> zoo.wakeAll();
                case 9 -> zoo.makeAllSwim();
                case 10 -> zoo.makeAllFly();
                case 11 -> zoo.makeAllWalk();
                case 12 -> {
                    zoo.clear();
                    System.out.println("Zoo cleared.");
                }
                case 13 -> {
                    System.out.println("Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
            System.out.println();
        }
    }
}
