package ro.ase.main;

import ro.ase.clase.Carte;
import ro.ase.clase.CartelaValida;
import ro.ase.clase.Datorie;
import ro.ase.facade.FacadeBiblioteca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carte carte1=new Carte("Mandrie si prejudecata", "Jane Austin", true);
        CartelaValida cartelaValida=new CartelaValida(false);
        Datorie datorie=new Datorie(false);
        FacadeBiblioteca facadeBiblioteca=new FacadeBiblioteca(cartelaValida, datorie);
        facadeBiblioteca.verificaUtilizator(carte1);

    }
}