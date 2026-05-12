package ro.ase.decorator;

import ro.ase.clase.BiletAbstract;

public class BiletPremium extends BiletDecorator{
    public BiletPremium(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void printeazaBilet() {
        System.out.println("Bilet premium");
    }
}
