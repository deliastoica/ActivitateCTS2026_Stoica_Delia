package ro.ase.seminar.main;

import ro.ase.seminar.clase.Autobuz;
import ro.ase.seminar.clase.Command;
import ro.ase.seminar.clase.Operator;
import ro.ase.seminar.clase.Plecare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Operator operator=new Operator();
        Command comanda1=new Plecare(new Autobuz("Mercedes"), 223);
        Command comanda2=new Plecare(new Autobuz("Audi"), 11);

        operator.adaugaComanda(comanda1);
        operator.executaComanda();
        operator.adaugaComanda(comanda2);
        operator.executaComanda();
    }
}