package ro.ase.clase.main;

import ro.ase.clase.clase.Curatare;
import ro.ase.clase.clase.Sala;
import ro.ase.clase.clase.SistemDeProiectie;
import ro.ase.facade.FacadeCinema;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Sala sala1=new Sala(11);
        Curatare curatare1=new Curatare(true);
        SistemDeProiectie sistemDeProiectie1=new SistemDeProiectie(false);
        FacadeCinema facadeCinema=new FacadeCinema(curatare1, sistemDeProiectie1);
        facadeCinema.verificaSala(sala1);
    }
}