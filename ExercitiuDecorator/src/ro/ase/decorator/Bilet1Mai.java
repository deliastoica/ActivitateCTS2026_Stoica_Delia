package ro.ase.decorator;

import ro.ase.clase.IBilet;

public class Bilet1Mai extends BiletDecorator{
    public Bilet1Mai(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void printeazaOcazie() {
        System.out.println("La multi ani!");
    }
}
