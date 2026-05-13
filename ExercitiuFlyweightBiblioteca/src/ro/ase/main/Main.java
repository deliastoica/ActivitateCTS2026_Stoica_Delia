package ro.ase.main;

import ro.ase.clase.FlyweightUtilizator;
import ro.ase.clase.Imprumut;
import ro.ase.clase.Utilizator;
import ro.ase.clase.UtilizatorAbstract;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FlyweightUtilizator flyweightUtilizator=new FlyweightUtilizator();
        UtilizatorAbstract utilizator1=new Utilizator("Ana", "0742739306", "ana@mail.com");
        Imprumut imprumut1=new Imprumut("Ion", "12.05.2026", 5);
        flyweightUtilizator.getUtilizator("Ana", "0742739306", "ana@mail.com").imprumuta(imprumut1);


    }
}