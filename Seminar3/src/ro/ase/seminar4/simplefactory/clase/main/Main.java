package ro.ase.seminar4.simplefactory.clase.main;

import ro.ase.seminar4.simplefactory.clase.factory.Factory;
import ro.ase.seminar4.simplefactory.clase.mijlocdetransport.Autobuz;
import ro.ase.seminar4.simplefactory.clase.mijlocdetransport.MijlocDeTransport;
import ro.ase.seminar4.simplefactory.clase.mijlocdetransport.TipTransport;

public class Main {
    public static void main(String[] args) {
        Factory fabricaTransport=new Factory();
        MijlocDeTransport autobuz = (Autobuz) fabricaTransport.getMijlocTransport(TipTransport.AUTOBUZ, "MAN", 102);
        autobuz.afiseazaTipTransport();
        MijlocDeTransport tramvai=fabricaTransport.getMijlocTransport(TipTransport.TRAMVAI, "Imporio", 41);
        tramvai.afiseazaTipTransport();
    }
}
