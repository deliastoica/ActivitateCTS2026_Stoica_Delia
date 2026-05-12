package ro.ase.main;

import ro.ase.clase.Categorie;
import ro.ase.clase.Produs;
import ro.ase.clase.Structura;
import ro.ase.clase.Subcategorie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Structura categorie=new Categorie("Electronice");
        Structura subcategorie=new Subcategorie("Laptopuri");
        Structura produs1=new Produs("ASUS", 3200.99);
        Structura produs2=new Produs("Lenovo", 2800.33);
        ((Categorie) categorie).adaugaStructura(subcategorie);
        ((Subcategorie) subcategorie).adaugaStructura(produs1);
        ((Subcategorie) subcategorie).adaugaStructura(produs2);
        categorie.afiseazaDetaliiStructura("  ");

    }
}