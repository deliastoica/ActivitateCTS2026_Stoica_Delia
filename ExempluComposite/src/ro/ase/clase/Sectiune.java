package ro.ase.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Structura{
    private String denumire;
    private List<Structura> structuraList;


    public Sectiune(String denumire) {
        this.denumire = denumire;
        this.structuraList=new ArrayList<>();
    }

    public void adaugaStructura(Structura structura)
    {
        structuraList.add(structura);
    }

    public void stergeStructura(Structura structura)
    {
        structuraList.remove(structura);
    }

    public Structura getPozitie(int pozitie)
    {
         return structuraList.get(pozitie);
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
     System.out.println(spatii+"Sectiune "+ denumire+ " contine ");
     for(Structura s: structuraList)
         s.afiseazaDetaliiStructura(spatii+"   ");
    }
}
