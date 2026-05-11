package ro.ase.facade;

import ro.ase.clase.Camera;
import ro.ase.clase.Curatare;
import ro.ase.clase.Minibar;
import ro.ase.main.Main;

public class FacadeHotel {
    private Curatare curatare;
    private Minibar minibar;

    public FacadeHotel(Curatare curatare, Minibar minibar) {
        this.curatare = curatare;
        this.minibar = minibar;
    }

    public void verifica(Camera camera)
    {
        if(camera.EsteLibera())
        {
            if(curatare.esteCurata())
            {
                if(minibar.esteAprovizionat())
                {
                    System.out.println("Camera este pregatita pentru urmatorul client");
                }
                else System.out.println("Minibarul nu a fost aprovizinat");
            }
            else System.out.println("Camera nu s fost curatata");
        }
        else System.out.println("Camara nu este libera");
    }
}
