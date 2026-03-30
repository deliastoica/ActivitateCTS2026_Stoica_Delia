package main;

import builder.PachetTransport;
import builder.PachetTransportAlternativ;
import builder.PachetTransportBuilder;
import builder.PachetTransportBuilderAbstract;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PachetTransport pache1=new PachetTransport(true, false, true, "Alex Stan");
        PachetTransport pache2=new PachetTransport(false, false, true, "Andrei Popa");
        PachetTransportBuilder builder=new PachetTransportBuilder("Andrei Popa");
        PachetTransport pachet3=builder.build();
        //PachetTransport pachet4=builder.setAC(true).setTV(false).setWIFI(true).setNumeClient("Ana Zolescu").build();
        System.out.println(pache2.toString());
        System.out.println(pachet3.toString());
        //System.out.println(pachet4.toString());

        PachetTransportAlternativ builderAlternativ=new PachetTransportAlternativ("Alex Stan");
        PachetTransport pachet5=builderAlternativ.build("Alex Stan");
        builderAlternativ.setAC(false);
        System.out.println(pachet5.toString());

        builderAlternativ.setAC(false);
        builderAlternativ.setNumeClient("Marius Doru");

        PachetTransport pachet6 = builderAlternativ.build("Marius Doru");
        System.out.println(pachet6);


    }
}