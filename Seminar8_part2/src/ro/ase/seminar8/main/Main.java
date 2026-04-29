package ro.ase.seminar8.main;

import ro.ase.seminar8.clase.Departament;
import ro.ase.seminar8.clase.Sectie;
import ro.ase.seminar8.clase.Structura;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Structura dep1=new Departament("Spital");
        Structura dep2=new Departament("administrativ");
        Structura sectieSecretariat=new Sectie("Secretariat", 50);
        Structura sectieManagement=new Sectie("Management", 70);

        ((Departament) dep1).adaugaStructura(dep2);
        ((Departament) dep1).adaugaStructura(sectieManagement);
        ((Departament) dep2).adaugaStructura(sectieSecretariat);

        dep1.afiseazaDetaliiStrcutura("   ");
        ((Departament) dep1).stergeStructura(sectieManagement);
        ((Departament) dep2).adaugaStructura(sectieManagement);




    }
}