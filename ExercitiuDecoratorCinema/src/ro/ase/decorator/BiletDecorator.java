package ro.ase.decorator;

import ro.ase.clase.BiletAbstract;

public abstract class BiletDecorator implements BiletAbstract{
    private BiletAbstract bilet;

    public BiletDecorator(BiletAbstract bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeaza() {
        bilet.printeaza();
    }

    public abstract void printeazaBilet();
}
