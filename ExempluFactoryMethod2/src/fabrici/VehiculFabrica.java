package fabrici;

import clase.Vehicul;

public interface VehiculFabrica {
    public Vehicul getVehicul(TipVehicul tip, String marca, int an, String km);
}
