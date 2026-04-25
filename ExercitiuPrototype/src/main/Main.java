package main;

import clase.ContBancar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContBancar cont1=new ContBancar("Jean Luca", 1000, "1234567890");
        ContBancar cont2=(ContBancar) cont1.copiaza();
        cont2.setNumeTitular("Avram Iancu");
        System.out.println(cont1.toString());
        System.out.println(cont2.toString());

    }
}