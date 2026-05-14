package ro.ase.clase;

import java.util.ArrayList;
import java.util.List;

public class Subdepartament implements Structura{
    private String denumire;
    private List<Structura> subdepartament;

    public Subdepartament(String denumire) {
        this.denumire = denumire;
        this.subdepartament = new ArrayList<>();
    }

    public void adaugaStructura(Structura structura)
    {
        subdepartament.add(structura);
    }

    public void stergeStructura(Structura structura)
    {
        subdepartament.add(structura);
    }

    @Override
    public void contine(String spatii) {
        System.out.println(spatii+ "Subdepartamentul "+this.denumire);
        for(Structura s: subdepartament)
            s.contine(spatii+"  ");

    }
}
