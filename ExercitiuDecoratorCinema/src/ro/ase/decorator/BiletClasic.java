package ro.ase.decorator;

import ro.ase.clase.BiletAbstract;

public class BiletClasic extends BiletDecorator {
    public BiletClasic(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void printeazaBilet() {
        System.out.println("Biletul clasic");
    }
}
