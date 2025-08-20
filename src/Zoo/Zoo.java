package src.Zoo;

import java.util.ArrayList;
import java.util.List;

import src.Abstract_classes.Animal;
import src.Interfaces.Flyer;
import src.Interfaces.Swimmer;
import src.Interfaces.Walker;

public class Zoo {
    private final List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        if (animal == null)
            throw new IllegalArgumentException("Animal cannot be null");
        animals.add(animal);
    }

    public int countAll() {
        return animals.size();
    }

    public void sleepAll() {
        if (animals.isEmpty()) {
            System.out.println("No animal has been added");
        } else {
            for (Animal a : animals) {
                a.sleep();
            }
        }

    }

    public void wakeAll() {
        if (animals.isEmpty()) {
            System.out.println("No animal has been added");
        } else {
            for (Animal a : animals) {
                a.wakeUp();
            }
        }
    }

    public void feedAll() {
        if (animals.isEmpty()) {
            System.out.println("No animal has been added");
        } else {
            for (Animal a : animals)
                a.eat();
        }
    }

    public List<Swimmer> getSwimmers() {
        List<Swimmer> swimmers = new ArrayList<>();
        for (Animal a : animals) {
            if (a instanceof Swimmer)
                swimmers.add((Swimmer) a);
        }
        return swimmers;
    }

    public void makeAllSwim() {
        List<Swimmer> swimmers = getSwimmers();
        if (swimmers.isEmpty()) {
            System.out.println("No animal has been added");
        } else {
            for (Swimmer s : swimmers) {
                s.swim();
            }

        }

    }

    public List<Flyer> getFlyers() {
        List<Flyer> flyers = new ArrayList<>();
        for (Animal a : animals) {
            if (a instanceof Flyer)
                flyers.add((Flyer) a);
        }
        return flyers;
    }

    public void makeAllFly() {
        List<Flyer> flyers = getFlyers();
        if (flyers.isEmpty()) {
            System.out.println("No animal has been added");
        } else {
            for (Flyer f : flyers) {
                f.fly();
            }
        }
    }

    public List<Walker> getWalkers() {
        List<Walker> walkers = new ArrayList<>();
        for (Animal a : animals) {
            if (a instanceof Walker)
                walkers.add((Walker) a);
        }
        return walkers;
    }

    public void makeAllWalk() {
        List<Walker> walkers = getWalkers();
        if (walkers.isEmpty()) {
            System.out.println("No animal has been added");
        } else {
            for (Walker w : walkers) {
                w.walk();
            }
        }

    }

    public int countSwimmers() {
        return getSwimmers().size();
    }

    public int countFlyers() {
        return getFlyers().size();
    }

    public int countWalkers() {

        return getWalkers().size();
    }

    public List<Animal> allAnimals() {
        return new ArrayList<>(animals);
    }

    public void clear() {
        animals.clear();
    }
}
