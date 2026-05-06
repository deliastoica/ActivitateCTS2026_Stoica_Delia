package ro.ase.seminar.main;

import ro.ase.seminar.clase.ISpital;
import ro.ase.seminar.clase.Pacient;
import ro.ase.seminar.clase.PacientAbonat;
import ro.ase.seminar.clase.Spital;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientAbonat("Popescu", 21);
        Pacient pacient2 = new PacientAbonat("Ionescu", 40);
        Pacient pacient3 = new PacientAbonat("Tudorache", 50);

        ISpital spital = new Spital("Cantacuzino");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);

        ((Spital)spital).notifcaEpidemie();
        ((Spital)spital).notificaVirus();
    }
}