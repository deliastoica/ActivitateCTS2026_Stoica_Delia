package ro.ase.seminar4.singleton.main;

import ro.ase.seminar4.singleton.clase.Logger;

public class Main {
    public static void main(String[] args)
    {
       Logger instance = Logger.getInstance("Interfata", "afisare");
       instance.afisareLog("fisierul json nu e afisat corect");
       Logger instance2=Logger.getInstance("Backend", "afisare");
       instance2.afisareLog("eroare");
       instance2.setCategorie("baza de date");
       instance2.setSender("Backend");
       instance2.afisareLog("eroare la inserare");

    }
}
