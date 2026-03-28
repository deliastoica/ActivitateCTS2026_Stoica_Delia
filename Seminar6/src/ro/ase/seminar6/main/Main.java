package ro.ase.seminar6.main;

import ro.ase.seminar6.clase.Ciorba;
import ro.ase.seminar6.clase.FelDeMancare;
import ro.ase.seminar6.clase.Supa;
import ro.ase.seminar6.clase.SupaCrema;
import ro.ase.seminar6.fabrici.*;

public class Main {
    public static void main(String[] args){
        FelDeMancareFabrica fabrica=new SupaFabrica();
        FelDeMancare supaCrema=fabrica.getFelDeMancare(TipSupa.SUPA_CREMA ,500, "supaMorcovi");
        FelDeMancare ciorba=fabrica.getFelDeMancare(TipSupa.CIORBA, 100, "ciorbaDePui");
        FelDeMancareFabrica fabrica1=new DesertFabrica();
        FelDeMancare papanasi=fabrica1.getFelDeMancare(TipDesert.PAPANASI, 90, "papanasiCuDulceata", 700);
        FelDeMancare clatite=fabrica1.getFelDeMancare(TipDesert.CLATITE, 400, "clatiteCuBanane", 200);
        supaCrema.afisezaPret();
        ciorba.afisezaPret();
        papanasi.afisezaPret();
        clatite.afisezaPret();
    }
}

