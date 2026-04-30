package ro.ase.seminar9.main;

import ro.ase.seminar9.clase.Client;
import ro.ase.seminar9.clase.PlataCard;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Client client1=new Client("Anastasia");
        client1.setModalitatePlata(new PlataCard());
        client1.platesteTranzactie(300.08);
    }
}