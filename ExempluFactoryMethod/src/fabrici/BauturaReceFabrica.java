package fabrici;

import clase.Bautura;
import clase.Limonada;
import clase.Suc;

public class BauturaReceFabrica implements BauturaFabrica{

    @Override
    public Bautura getBautura(TipBautura tip, String denumire, float pret, int calorii) {
       switch (tip)
       {
           case TipBauturaRece.LIMONADA:
               return new Limonada(denumire, pret, calorii);
           case TipBauturaRece.SUC:
               return new Suc(denumire, pret, calorii);
           default:
               return null;
       }
    }
}
