package ro.ase.main;

import ro.ase.clase.Bilet;
import ro.ase.clase.IBilet;
import ro.ase.decorator.BiletCraciun;
import ro.ase.decorator.BiletDecorator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IBilet bilet1=new Bilet("Londra", "19.05.2026");
        //bilet1.printeaza();
        BiletDecorator biletDecorator=new BiletCraciun(bilet1);
        biletDecorator.printeaza();
    }
}