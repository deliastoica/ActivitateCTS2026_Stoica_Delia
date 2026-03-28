package ro.ase.seminar6.main;

import ro.ase.seminar6.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare=new Rezervare("Eze", 21, 3, "1234567890123456");
        Rezervare rezervare1=(Rezervare) rezervare.copiaza();
        rezervare1.setOra(19);
        System.out.println(rezervare1.toString());
    }
}
