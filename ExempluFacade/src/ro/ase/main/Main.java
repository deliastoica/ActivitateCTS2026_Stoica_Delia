package ro.ase.main;

import ro.ase.clase.Debarasare;
import ro.ase.clase.Masa;
import ro.ase.clase.Servetele;
import ro.ase.facade.FacadeRestaurant;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa("5", true);
        Debarasare debarasare =
                new Debarasare();

        Servetele servetele =
                new Servetele();

        FacadeRestaurant facade =
                new FacadeRestaurant(
                        debarasare,
                        servetele);

        facade.verificaMasa(masa);
    }
    }
