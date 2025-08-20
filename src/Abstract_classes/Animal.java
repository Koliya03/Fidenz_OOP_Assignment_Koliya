package src.Abstract_classes;

import src.Interfaces.Flyer;
import src.Interfaces.Swimmer;
import src.Interfaces.Walker;

public abstract class Animal {
    private boolean asleep = false;
    private static int counter = 1;
    private final int id;

    public Animal() {
        this.id = counter++;
    }

    public int getID() {
        return this.id;
    }

    public void sleep() {
        if (!asleep) {
            asleep = true;
        }

    }

    public void wakeUp() {
        if (asleep) {
            asleep = false;
        }
    }

    public boolean isAsleep() {
        return asleep;
    }

    public abstract void eat();

    public abstract void sound();

    public boolean isSwimmer() {
        return this instanceof Swimmer;
    }

    public boolean isWalker() {
        return this instanceof Walker;
    }

    public boolean isFlyer() {
        return this instanceof Flyer;
    }
}
