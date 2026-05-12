package ro.ase.clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Structura{
    private String denumire;
    private List<Structura> structuraList;

    public Categorie(String denumire) {
        this.denumire = denumire;
        this.structuraList = new ArrayList<>();
    }

    public void adaugaStructura(Structura structura)
    {
        structuraList.add(structura);
    }

    public void strergeStructura(Structura structura)
    {
        structuraList.remove(structura);
    }

    public Structura getStructura(int pozitie)
    {
        return structuraList.get(pozitie);
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
    System.out.println(spatii+"Categoria "+this.denumire+" contine ");
    for(Structura s: structuraList)
        s.afiseazaDetaliiStructura(spatii+"   ");
    }
}
