package ro.ase.main;

import ro.ase.clase.Item;
import ro.ase.clase.Sectiune;
import ro.ase.clase.Structura;
import ro.ase.clase.Subsectiune;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Structura sectiune1=new Sectiune("Bauturi");
        Structura subsectiune1=new Subsectiune("Sucuri");
        Structura item1=new Item("Cola", 10.00);
        Structura item2=new Item("Pepsi", 11.00);

        Structura sectiune2=new Sectiune("Fel principal");
        Structura subsectiune2=new Subsectiune("Pizza");
        Structura item3=new Item("Diavola", 40.40);
        ((Sectiune) sectiune1)
                .adaugaStructura(subsectiune1);

        ((Subsectiune) subsectiune1)
                .adaugaStructura(item1);

        ((Subsectiune) subsectiune1)
                .adaugaStructura(item2);
        ((Sectiune) sectiune2)
                .adaugaStructura(subsectiune2);

        ((Subsectiune) subsectiune2)
                .adaugaStructura(item3);
        sectiune1.afiseazaDetaliiStructura(" ");
        sectiune2.afiseazaDetaliiStructura(" ");
    }
}