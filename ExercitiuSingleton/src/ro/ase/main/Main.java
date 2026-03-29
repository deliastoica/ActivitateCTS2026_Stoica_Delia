package ro.ase.main;

import ro.ase.clase.Banca;

public class Main {
    public static void main(String[] args){
    Banca instance=Banca.getInstance("ING", 100);
    instance.afisare();
    Banca instance2=Banca.getInstance("ING", 100);
    instance2.setNumeBanca("BCR");
    instance2.depune(200);
    instance2.afisare();

    }
}
