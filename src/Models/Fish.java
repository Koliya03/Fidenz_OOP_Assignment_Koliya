package src.Models;

import src.Abstract_classes.Animal;
import src.Interfaces.Swimmer;

public class Fish extends Animal implements Swimmer {
    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Fish (ID):" + super.getID() + " is now sleeping");
    }

    @Override
    public void wakeUp() {
        super.wakeUp();
        System.out.println("Fish (ID):" + super.getID() + " is now awake");
    }

    @Override
    public void eat() {
        System.out.println("Fish (ID):" + super.getID() + " is eating fish foods");
    }

    @Override
    public void sound() {
        System.out.println("Fish (ID):" + super.getID() + " makes bubbles.");
    }

    @Override
    public void swim() {
        System.out.println("Fish (ID):" + super.getID() + " is swimming.");
    }
}
