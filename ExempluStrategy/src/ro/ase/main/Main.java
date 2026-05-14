package ro.ase.main;

import ro.ase.clase.Calator;
import ro.ase.clase.PlataSMS;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calator calator1=new Calator("Andreea");
        calator1.plateste(3.00);
        calator1.setPlata(new PlataSMS());
        calator1.plateste(5.00);


    }
}