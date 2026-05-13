package ro.ase.decorator;

import ro.ase.clase.IBilet;

public abstract class BiletDecorator implements IBilet{
    private IBilet bilet;

    public BiletDecorator(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeaza() {
        bilet.printeaza();
        printeazaBIlet();
    }

    public abstract void printeazaBIlet();
}
