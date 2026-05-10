package ro.ase.main;

import ro.ase.clase.AdaterApartament;
import ro.ase.clase.ApartamentPremium;
import ro.ase.clase.CameraHotel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void proceseazaInchiere(CameraHotel camera)
    {
        camera.rezervaCamera();
    }
    public static void main(String[] args) {
      CameraHotel camera1=new CameraHotel();
      camera1.rezervaCamera();
      proceseazaInchiere(camera1);

        ApartamentPremium apartament1=new ApartamentPremium();
        AdaterApartament adaterApartament=new AdaterApartament(apartament1);
        proceseazaInchiere(adaterApartament);
    }
}