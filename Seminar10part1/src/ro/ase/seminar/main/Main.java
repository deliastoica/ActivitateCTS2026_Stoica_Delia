package ro.ase.seminar.main;

import ro.ase.seminar.clase.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Popescu");
        Pacient pacient2 = new Pacient("Stan");

        PersonalSpital medic = new Medic("Mocanu");
        PersonalSpital asistenta = new Asistenta("Avram");
        Command comanda1 = new Internare(medic, pacient1);
        Command comanda2 = new Tratare(asistenta, pacient2);
        Operator operator = new Operator();
        operator.inregistreaza(comanda1);
        operator.inregistreaza(comanda2);
        operator.executaFisa();
        operator.inregistreaza(new Tratare(asistenta, new Pacient("Andreescu")));
        operator.executaFisa();
        operator.executaFisa();
    }
}