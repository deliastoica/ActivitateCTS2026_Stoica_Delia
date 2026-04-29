package ro.ase.seminar8.main;

import ro.ase.seminar8.clase.NotaDePlata;
import ro.ase.seminar8.clase.NotaDePlataAbstract;
import ro.ase.seminar8.clase.decorator.NotaDePlata1Mai;
import ro.ase.seminar8.clase.decorator.NotaDePlataDecorator;
import ro.ase.seminar8.clase.decorator.NotaDePlataNoulAn;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstract notaDePlata1=new NotaDePlata(200.78f, "20-03-2018");
        NotaDePlataAbstract notaDePlata2=new NotaDePlata(300, "17-11-2023");
        notaDePlata1.printeaza();
        notaDePlata2.printeaza();
        NotaDePlataDecorator notaDePlata3=new NotaDePlataNoulAn(notaDePlata1);
        notaDePlata3.printeazaFelicitare();

        int input=1;
        if(input==0)
        {
            NotaDePlataDecorator notaDePlata4=new NotaDePlataNoulAn(notaDePlata1);
            notaDePlata4.printeazaFelicitare();
        }
        else
        {
            NotaDePlataDecorator notaDePlata4=new NotaDePlata1Mai(notaDePlata1);
            notaDePlata4.printeazaFelicitare();
        }

    }
}