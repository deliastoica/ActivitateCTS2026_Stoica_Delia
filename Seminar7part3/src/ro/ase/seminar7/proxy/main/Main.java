package ro.ase.seminar7.proxy.main;

import ro.ase.seminar7.proxy.clase.Pacient;
import ro.ase.seminar7.proxy.clase.Spital;
import ro.ase.seminar7.proxy.proxy.ProxyCuAsigurare;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient(false, "David");
        Spital spital = new Spital("Judetean");

        spital.interneazaPacient(pacient);

        ProxyCuAsigurare proxy = new ProxyCuAsigurare(spital);
        proxy.interneazaPacient(pacient);

    }
}
