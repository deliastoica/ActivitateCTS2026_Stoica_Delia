package ro.ase.proxy;

import ro.ase.clase.Rezervare;
import ro.ase.clase.RezervareAbstract;

public class ProxyRezervare implements RezervareAbstract {
    private RezervareAbstract rezervare;

    public ProxyRezervare(RezervareAbstract rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public int getNrPersone() {
        return rezervare.getNrPersone();
    }
    @Override
    public void reazlizeazaRezervare() {
        if(rezervare.getNrPersone()>=4)
            rezervare.reazlizeazaRezervare();
        else System.out.println("Nu sunt suficiente persoane!");
    }


}
