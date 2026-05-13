package ro.ase.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightUtilizator {
    private Map<String, UtilizatorAbstract> utilizatori=new HashMap<>();



    public UtilizatorAbstract getUtilizator(String nume, String telefon, String mail)
    {
        UtilizatorAbstract utilizator=utilizatori.get(nume);
        if(utilizator==null)
        {
            utilizator=new Utilizator(nume, telefon, mail);
            utilizatori.put(nume, utilizator);
        }
        return utilizator;
    }
}
