package ro.ase.main;

import ro.ase.clase.AdaterBiletTren;
import ro.ase.clase.BiletAutobuz;
import ro.ase.clase.BiletTren;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void proceseazaBilet(BiletAutobuz biletAutobuz)
    {
        biletAutobuz.emiteBilet();
    }
    public static void main(String[] args) {
     BiletAutobuz biletAutobuz1=new BiletAutobuz();
     proceseazaBilet(biletAutobuz1);
     BiletTren biletTren1=new BiletTren();
     AdaterBiletTren adaterBiletTren=new AdaterBiletTren(biletTren1);
     proceseazaBilet(adaterBiletTren);
    }
}