package zoo;

import ro.ase.seminar1.animale.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nume;
    private ZooKeeper zooKeeper;
    private List<Animal> animals;

    public Zoo(ZooKeeper zooKeeper, String nume) {
        this.zooKeeper = zooKeeper;
        this.nume = nume;
        this.animals = new ArrayList<>();;
    }
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void feedAllAnimals() {
        for (Animal animal : animals) {
            zooKeeper.feedAnimal(animal);
        }
    }

}
