package main;

import clase.Vehicul;
import fabrici.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VehiculFabrica vehiculFabrica1=new MasinaFabrica();
        Vehicul masina1=vehiculFabrica1.getVehicul(TipMasina.SUV, "BMW", 2027, "200000");
        masina1.afisareInformatii();
        VehiculFabrica vehiculFabrica2=new MotocicletaFabrica();
        Vehicul motocicleta1=vehiculFabrica2.getVehicul(TipMotocicleta.SPORT, "Audi", 2028, "234565");
        motocicleta1.afisareInformatii();
    }
}