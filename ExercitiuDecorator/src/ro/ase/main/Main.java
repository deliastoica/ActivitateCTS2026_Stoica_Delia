package ro.ase.main;

import ro.ase.clase.Bilet;
import ro.ase.clase.IBilet;
import ro.ase.decorator.Bilet1Mai;
import ro.ase.decorator.BiletDecorator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IBilet bilet1=new Bilet("o calatorie");
        IBilet bilet2=new Bilet("toata ziua");
        BiletDecorator biletDecorator=new Bilet1Mai(bilet1);
        biletDecorator.printeaza();
    }
}