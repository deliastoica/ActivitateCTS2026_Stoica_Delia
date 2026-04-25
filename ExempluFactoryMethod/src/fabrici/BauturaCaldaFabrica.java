package fabrici;

import clase.Bautura;
import clase.Cafea;
import clase.Ceai;

public class BauturaCaldaFabrica implements BauturaFabrica{


    @Override
    public Bautura getBautura(TipBautura tip, String denumire, float pret, int calorii) {
        switch (tip)
        {
            case TipBauturaCalda.CAFEA:
                return new Cafea(denumire, pret, calorii);
            case TipBauturaCalda.CEAI:
                return new Ceai(denumire, pret, calorii);
            default:
            {
                return null;
            }
        }
    }
}
