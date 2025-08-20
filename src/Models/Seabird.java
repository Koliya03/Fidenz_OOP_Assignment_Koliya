package src.Models;

import src.Abstract_classes.Animal;
import src.Interfaces.Flyer;
import src.Interfaces.Swimmer;
import src.Interfaces.Walker;

public class Seabird extends Animal implements Flyer, Swimmer, Walker {
    @Override
    public void sleep() {
        super.sleep();
        System.out.println("sea bird (ID):" + super.getID() + " is sleeping");
    }

    @Override
    public void wakeUp() {
        super.wakeUp();
        System.out.println("sea bird (ID):" + super.getID() + " is awake");
    }

    @Override
    public void eat() {
        System.out.println("sea bird (ID):" + super.getID() + " eats fishes.");
    }

    @Override
    public void sound() {
        System.out.println("sea bird (ID):" + super.getID() + "is squawking.");
    }

    @Override
    public void fly() {
        System.out.println("sea bird (ID):" + super.getID() + "is flying.");
    }

    @Override
    public void swim() {
        System.out.println("sea bird (ID):" + super.getID() + "is swiming.");
    }

    @Override
    public void walk() {
        System.out.println("sea bird (ID):" + super.getID() + "is walking.");
    }
}
