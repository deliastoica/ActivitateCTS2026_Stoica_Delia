package main;

import factory.Factory;
import pachetTuristic.PachetTuristic;
import pachetTuristic.TipPachet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Factory agentieTurism=new Factory();
        PachetTuristic cazare= agentieTurism.createInstance(TipPachet.PACHET_CAZARE, "HOTEL UNIREA");
        cazare.descrie();
        PachetTuristic transport=agentieTurism.createInstance(TipPachet.PACHET_TRANSPORT, "WIZZ AIR");
        transport.descrie();
        PachetTuristic cazareSiTransport=agentieTurism.createInstance(TipPachet.PACHET_CAZARE_TRANSPORT, "HOTEL UNIEREA SI WIZZ AIR");
        cazareSiTransport.descrie();

    }
}