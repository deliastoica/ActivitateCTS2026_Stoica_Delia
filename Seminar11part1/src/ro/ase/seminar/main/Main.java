package ro.ase.seminar.main;

import ro.ase.seminar.clase.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CalatorieHandler calatorieAutobuz=new CalatorieAutobuz();
        CalatorieHandler calatorieTroilebuz=new CalatorieTroilebuz();
        CalatorieHandler calatorieTramvai=new CalatorieTramvai();
        CalatorieHandler calatorieMetrou=new CalatorieMetrou();


        calatorieTroilebuz.setSuccesor(calatorieAutobuz);
        calatorieAutobuz.setSuccesor(calatorieTramvai);
        calatorieTramvai.setSuccesor(calatorieMetrou);

        System.out.println(calatorieTroilebuz.recomandaCalatorie(2));
        System.out.println(calatorieTroilebuz.recomandaCalatorie(5));
        System.out.println(calatorieTroilebuz.recomandaCalatorie(12));
    }
}