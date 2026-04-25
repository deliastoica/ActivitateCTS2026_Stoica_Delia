package fabrici;

import clase.Masina;
import clase.SUV;
import clase.Sedan;
import clase.Vehicul;

public class MasinaFabrica implements VehiculFabrica{
    @Override
    public Vehicul getVehicul(TipVehicul tip, String marca, int an, String km) {
        switch (tip)
        {
            case TipMasina.SEDAN:
                return new Sedan(an, marca, km);
            case TipMasina.SUV:
                return new SUV(an, marca, km);
            default:
                return null;
        }
    }
}
