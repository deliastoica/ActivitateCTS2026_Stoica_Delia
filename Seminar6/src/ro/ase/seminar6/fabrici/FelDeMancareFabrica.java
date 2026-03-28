package ro.ase.seminar6.fabrici;

import ro.ase.seminar6.clase.FelDeMancare;

public interface FelDeMancareFabrica {
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii);

    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire);
}
