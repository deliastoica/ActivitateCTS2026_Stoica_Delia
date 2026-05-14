package ro.ase.main;

import ro.ase.clase.Departament;
import ro.ase.clase.Profesor;
import ro.ase.clase.Structura;
import ro.ase.clase.Subdepartament;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Structura departament1=new Departament("Informatica");
        Structura subdepartament=new Subdepartament("Baze de date");
        Structura profesor=new Profesor("Popescu");
        Structura profesor2=new Profesor("Gigel");
        ((Departament) departament1).adaugaStructura(subdepartament);
        ((Subdepartament) subdepartament).adaugaStructura(profesor);
        ((Subdepartament) subdepartament).adaugaStructura(profesor2);
        departament1.contine("   ");
    }
}