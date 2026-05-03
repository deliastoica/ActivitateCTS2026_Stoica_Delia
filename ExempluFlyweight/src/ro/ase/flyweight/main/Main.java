package ro.ase.flyweight.main;

import ro.ase.flyweight.clase.PacientAbstract;
import ro.ase.flyweight.clase.PacientFactory;
import ro.ase.flyweight.clase.Sectie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PacientFactory factory = new PacientFactory();

        PacientAbstract p1 = factory.getPacient("Anton", "071111111", "Str 1");
        PacientAbstract p2 = factory.getPacient("Maria", "072222222", "Str 2");

        p1.afiseazaSectie(new Sectie(1, 1, 1));
        p2.afiseazaSectie(new Sectie(2, 2, 2));
        p1.afiseazaSectie(new Sectie(3, 3, 3));
    }
    }
