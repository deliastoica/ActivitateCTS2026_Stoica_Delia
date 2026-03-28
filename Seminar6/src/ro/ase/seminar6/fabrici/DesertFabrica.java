package ro.ase.seminar6.fabrici;

import ro.ase.seminar6.clase.Ciorba;
import ro.ase.seminar6.clase.Clatite;
import ro.ase.seminar6.clase.FelDeMancare;
import ro.ase.seminar6.clase.Papanasi;

public class DesertFabrica implements FelDeMancareFabrica{
    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii) {
        switch (tip){
            case TipDesert.PAPANASI:
                return new Papanasi(gramaj, denumire, calorii);

            case TipDesert.CLATITE:
                return new Clatite(gramaj, denumire, calorii);

            default:
                return null;
        }
    }

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire) {
        return this.getFelDeMancare(tip, gramaj, denumire, 500);
    }
}
