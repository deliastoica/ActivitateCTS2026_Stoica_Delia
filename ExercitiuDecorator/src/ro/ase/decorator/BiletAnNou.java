package ro.ase.decorator;

import ro.ase.clase.IBilet;

public class BiletAnNou extends BiletDecorator{
    public BiletAnNou(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void printeazaOcazie() {
        System.out.println("La multi ani!");
    }
}
