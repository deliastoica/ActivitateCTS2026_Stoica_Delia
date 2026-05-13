package ro.ase.decorator;

import ro.ase.clase.IBilet;

public class BiletPaste extends BiletDecorator{
    public BiletPaste(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void printeazaBIlet() {
        System.out.println("Zbor placut");
    }
}
