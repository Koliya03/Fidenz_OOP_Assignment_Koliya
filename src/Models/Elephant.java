package src.Models;

import src.Abstract_classes.Animal;
import src.Interfaces.Walker;

public class Elephant extends Animal implements Walker {
    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Elephant (ID):" + super.getID() + " is now sleeping");
    }

    @Override
    public void wakeUp() {
        super.wakeUp();
        System.out.println("Elephant (ID):" + super.getID() + " is now awake");
    }

    @Override
    public void eat() {
        System.out.println("Elephant (ID):" + super.getID() + " is eating fruitss.");
    }

    @Override
    public void sound() {
        System.out.println("Elephant (ID):" + super.getID() + " trumpets!");
    }

    @Override
    public void walk() {
        System.out.println("Elephant (ID):" + super.getID() + " is walking.");
    }
}
