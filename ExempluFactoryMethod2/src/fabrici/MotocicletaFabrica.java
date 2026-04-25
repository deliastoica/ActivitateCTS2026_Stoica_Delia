package fabrici;

import clase.Sport;
import clase.Touring;
import clase.Vehicul;

public class MotocicletaFabrica implements VehiculFabrica{
    @Override
    public Vehicul getVehicul(TipVehicul tip, String marca, int an, String km) {
        switch (tip)
        {
            case TipMotocicleta.SPORT:
                return new Sport(an, marca, km);
            case TipMotocicleta.TOURING:
                return new Touring(an, marca, km);
            default:
                return null;
        }
    }
}
