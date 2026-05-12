package ro.ase.clase;

import java.util.ArrayList;
import java.util.List;

public class Subcategorie implements Structura{
    private String denumire;
    private List<Structura> structuraList=new ArrayList<>();

    public Subcategorie(String denumire) {
        this.denumire = denumire;
        this.structuraList = new ArrayList<>();
    }

    public void adaugaStructura(Structura structura)
    {
        structuraList.add(structura);
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
    public void afiseazaDetaliiStructura(String spatii) {
    System.out.println(spatii+"Subcategoria "+ this.denumire+" contine " );
    for(Structura s: structuraList)
        s.afiseazaDetaliiStructura(spatii+"   ");
    }
}
