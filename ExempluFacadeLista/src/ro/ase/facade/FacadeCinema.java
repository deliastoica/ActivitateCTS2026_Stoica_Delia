package ro.ase.facade;

import ro.ase.clase.clase.Curatare;
import ro.ase.clase.clase.Sala;
import ro.ase.clase.clase.SistemDeProiectie;

public class FacadeCinema {
    private Curatare curatare;
    private SistemDeProiectie sistemDeProiectie;

    public FacadeCinema(Curatare curatare, SistemDeProiectie sistemDeProiectie) {
        this.curatare = curatare;
        this.sistemDeProiectie = sistemDeProiectie;
    }

    public void verificaSala(Sala sala)
    {
        if(sala.suntLocuriLibere())
        {
            if(curatare.isEsteCuratata()==true)
            {
                if(sistemDeProiectie.isEstePornit()==true)
                {
                    System.out.println("Sala este gata de urmatorul film");
                }
                else System.out.println("Sistemul de proiectie nu e pornit");
            }
            else System.out.println("Sala nu e curata");
        }
        else System.out.println("Nu sunt locuri disponibile");
    }
}
