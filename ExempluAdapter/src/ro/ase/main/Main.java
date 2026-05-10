package ro.ase.main;

import ro.ase.clase.AdapterBar;
import ro.ase.clase.ProdusBar;
import ro.ase.clase.ProdusBucatarie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void proceseazaProdus(ProdusBucatarie produs) {
        produs.printeazaFactura();
    }
    public static void main(String[] args) {
        ProdusBucatarie ciorba = new ProdusBucatarie();proceseazaProdus(ciorba);
        ProdusBar cola = new ProdusBar();

        AdapterBar colaAdaptata = new AdapterBar(cola);
        proceseazaProdus(colaAdaptata);
    }
    }
