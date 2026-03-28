package ro.ase.seminar6.fabrici;

import ro.ase.seminar6.clase.Ciorba;
import ro.ase.seminar6.clase.FelDeMancare;
import ro.ase.seminar6.clase.Supa;
import ro.ase.seminar6.clase.SupaCrema;

public class SupaFabrica implements FelDeMancareFabrica {
    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii) {
        return this.getFelDeMancare(tip, gramaj, denumire);
    }

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire) {
        switch (tip)
        {
            case TipSupa.SUPA_CREMA:
            return new SupaCrema(gramaj, denumire);

            case TipSupa.CIORBA:
            return new Ciorba(gramaj, denumire);

            default:
                return null;
        }
    }
}
