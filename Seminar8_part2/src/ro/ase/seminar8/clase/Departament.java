package ro.ase.seminar8.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{
    private String numeDep;
    private List<Structura> structuraList;

    public Departament(String numeDep) {
        this.numeDep = numeDep;
        this.structuraList = new ArrayList<>();
    }

    public void adaugaStructura(Structura structura)
    {structuraList.add(structura);

    }

    public void stergeStructura(Structura structura)
    {
        structuraList.remove(structura);
    }

    public Structura getStructura(int pozitie)
      {
        return structuraList.get(pozitie);
      }
    @Override
    public void afiseazaDetaliiStrcutura(String spatii) {
     System.out.println(spatii+"Nume dep "+this.numeDep);
     for(Structura s :structuraList)
         s.afiseazaDetaliiStrcutura(spatii+"   ");
    }
}
