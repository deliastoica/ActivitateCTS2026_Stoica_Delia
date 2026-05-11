package ro.ase.facade;

import ro.ase.clase.Carte;
import ro.ase.clase.CartelaValida;
import ro.ase.clase.Datorie;

public class FacadeBiblioteca {
    private CartelaValida cartelaValida;
    private Datorie datorie;


    public FacadeBiblioteca(CartelaValida cartelaValida, Datorie datorie) {
        this.cartelaValida = cartelaValida;
        this.datorie = datorie;
    }

    public void verificaUtilizator(Carte carte)
    {
        if(carte.isEsteDisponibila()==true)
        {
            if(datorie.isEsteDator()==true)
            {
                if(cartelaValida.isEsteValida()==true)
                {
                    System.out.println("Cartea "+ carte.toString()+ " este disponibila");
                }
                else System.out.println("Cartela nu este valida");
            }
            else System.out.println("Clientul este dator");
        }
        else System.out.println("Cartea nu este disponibila");
    }
}
