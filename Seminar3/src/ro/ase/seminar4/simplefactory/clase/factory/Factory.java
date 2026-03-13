package ro.ase.seminar4.simplefactory.clase.factory;

import ro.ase.seminar4.simplefactory.clase.mijlocdetransport.Autobuz;
import ro.ase.seminar4.simplefactory.clase.mijlocdetransport.MijlocDeTransport;
import ro.ase.seminar4.simplefactory.clase.mijlocdetransport.TipTransport;
import ro.ase.seminar4.simplefactory.clase.mijlocdetransport.Tramvai;

public class Factory {
    public MijlocDeTransport getMijlocTransport(TipTransport tip, String marca, Integer nrLinie)
    {
        switch (tip){
            case TipTransport.AUTOBUZ -> {
                return new Autobuz(nrLinie, marca);
            }
            case TipTransport.TRAMVAI -> {
                return new Tramvai(marca, nrLinie);
            }
            case TipTransport.TROILEBUZ -> {
                return new Tramvai(marca, nrLinie);
            }
            default -> {
                return null;
            }
        }

    }

}
