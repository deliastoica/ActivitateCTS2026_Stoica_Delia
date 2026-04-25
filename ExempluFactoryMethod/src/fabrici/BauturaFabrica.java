package fabrici;

import clase.Bautura;

public interface BauturaFabrica {
    public Bautura getBautura(TipBautura tip, String denumire, float pret, int calorii);
}
