package zoo;

import ro.ase.seminar1.animale.Animal;

public class ZooKeeper {
    private String nume;

    public ZooKeeper(String nume) {
        this.nume = nume;
    }

    public void feedAnimal(Animal animal) {
        animal.eat("mancare");
    }
}
