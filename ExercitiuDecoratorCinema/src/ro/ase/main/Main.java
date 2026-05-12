package ro.ase.main;

import ro.ase.clase.BiletAbstract;
import ro.ase.clase.BiletCinema;
import ro.ase.decorator.BiletClasic;
import ro.ase.decorator.BiletDecorator;
import ro.ase.decorator.BiletPremium;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BiletAbstract bilet1=new BiletCinema(22, "Avatar");
        BiletAbstract bilet2=new BiletCinema(68, "Barbie");
        bilet1.printeaza();
        bilet2.printeaza();
        BiletDecorator biletDecorator1=new BiletClasic(bilet1);
        BiletDecorator biletDecorator2=new BiletPremium(bilet2);
        biletDecorator1.printeazaBilet();
        biletDecorator2.printeazaBilet();
    }
}