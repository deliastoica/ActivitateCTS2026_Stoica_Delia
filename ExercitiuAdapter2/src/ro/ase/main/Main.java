package ro.ase.main;

import ro.ase.clase.AdaterLivrare;
import ro.ase.clase.LivrareInternationala;
import ro.ase.clase.LivrareStandard;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void priceseazaLivarare(LivrareStandard livrareStandard)
    {
        livrareStandard.livreaza();
    }
    public static void main(String[] args) {
    LivrareStandard livrareStandard=new LivrareStandard("12.12.2026", "CARGUS");
        LivrareInternationala livrareInternationala=new LivrareInternationala("13.06.2025", "DHL");
        priceseazaLivarare(livrareStandard);
        AdaterLivrare adaterLivrare=new AdaterLivrare(livrareInternationala);
        priceseazaLivarare(adaterLivrare);
    }
}