package ro.ase.main;

import ro.ase.clase.Camera;
import ro.ase.clase.Curatare;
import ro.ase.clase.Minibar;
import ro.ase.facade.FacadeHotel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Camera camera1=new Camera(11, true);
        Curatare curatare=new Curatare();
        Minibar minibar=new Minibar();
        FacadeHotel facadeHotel=new FacadeHotel(curatare, minibar);
        facadeHotel.verifica(camera1);

    }
}