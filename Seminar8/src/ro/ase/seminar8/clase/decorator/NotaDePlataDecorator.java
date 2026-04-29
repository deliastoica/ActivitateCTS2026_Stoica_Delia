package ro.ase.seminar8.clase.decorator;

import ro.ase.seminar8.clase.NotaDePlataAbstract;

public abstract class NotaDePlataDecorator implements NotaDePlataAbstract {
    private NotaDePlataAbstract notaDePlata1;

    public NotaDePlataDecorator(NotaDePlataAbstract notaDePlata1) {
        this.notaDePlata1 = notaDePlata1;
    }

    @Override
    public void printeaza() {
        notaDePlata1.printeaza();
    }

    public abstract void printeazaFelicitare();
}
