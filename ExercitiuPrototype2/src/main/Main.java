package main;

import clase.Produs;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produs produs1=new Produs("alune", 15, "mancare");
        Produs produs2=(Produs) produs1.copiaza();
        produs2.setDenumire("paine");
        produs2.setPret(3);
        System.out.println(produs1.toString());
        System.out.println(produs2.toString());
    }
}