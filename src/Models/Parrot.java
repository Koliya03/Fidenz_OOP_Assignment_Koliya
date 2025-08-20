package src.Models;

import src.Abstract_classes.Animal;
import src.Interfaces.Flyer;
import src.Interfaces.Walker;

public class Parrot extends Animal implements Flyer, Walker {
    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Parrot (ID):" + super.getID() + " is sleeping.");
    }

    @Override
    public void wakeUp() {
        super.wakeUp();
        System.out.println("Parrot (ID):" + super.getID() + " is awake.");
    }

    @Override
    public void eat() {
        System.out.println("Parrot (ID):" + super.getID() + " eats fruits.");
    }

    @Override
    public void sound() {
        System.out.println("Parrot (ID):" + super.getID() + " is talking.");
    }

    @Override
    public void fly() {
        System.out.println("Parrot (ID):" + super.getID() + " is flying.");
    }

    @Override
    public void walk() {
        System.out.println("Parrot (ID):" + super.getID() + " is walking.");
    }
}
