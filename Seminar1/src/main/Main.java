package main;

import ro.ase.seminar1.animale.Lion;
import ro.ase.seminar1.animale.Tigru;
import ro.ase.seminar1.animale.Zebra;
import zoo.Zoo;
import zoo.ZooKeeper;

public class Main {
    public static void main(String[] args) {

        ZooKeeper keeper = new ZooKeeper("Ion");

        Zoo zoo = new Zoo(keeper, "Park");

        zoo.addAnimal(new Lion("Simba", 5));
        zoo.addAnimal(new Zebra("Marty", 3));
        zoo.addAnimal(new Tigru("Shere Khan", 7, "Bengalez"));

        zoo.feedAllAnimals();
    }
}
