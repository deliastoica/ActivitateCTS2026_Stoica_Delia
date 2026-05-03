package ro.ase.flyweight.clase;

import java.util.HashMap;

public class PacientFactory {
    private HashMap<String, PacientAbstract> pacienti=new HashMap<>();


    public PacientAbstract getPacient(String nume, String nrTelefon, String adresa)
    {
        PacientAbstract pacient=pacienti.get(nume);

        if(pacient==null)
        {
            pacient= new Pacient(nume, nrTelefon, adresa);
            pacienti.put(nume, pacient);
        }

        return pacient;
    }
}
