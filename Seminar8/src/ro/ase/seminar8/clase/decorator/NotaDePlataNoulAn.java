package ro.ase.seminar8.clase.decorator;

import ro.ase.seminar8.clase.NotaDePlataAbstract;

public class NotaDePlataNoulAn extends NotaDePlataDecorator{
    public NotaDePlataNoulAn(NotaDePlataAbstract notaDePlata1) {
        super(notaDePlata1);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Felicitarea spune: La multi ani de anul nou!");
    }
}
