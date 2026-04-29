package ro.ase.seminar8.clase.decorator;

import ro.ase.seminar8.clase.NotaDePlataAbstract;

public class NotaDePlata1Mai extends NotaDePlataDecorator{
    public NotaDePlata1Mai(NotaDePlataAbstract notaDePlata1) {
        super(notaDePlata1);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Un 1 mai fericit!");
    }
}
