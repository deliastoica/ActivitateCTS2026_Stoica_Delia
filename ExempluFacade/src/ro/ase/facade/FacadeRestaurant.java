package ro.ase.facade;

import ro.ase.clase.Debarasare;
import ro.ase.clase.Masa;
import ro.ase.clase.Servetele;

public class FacadeRestaurant {
    private Debarasare debarasare;
    private Servetele servetele;

    public FacadeRestaurant(Debarasare debarasare, Servetele servetele) {
        this.debarasare = debarasare;
        this.servetele = servetele;
    }

    public void verificaMasa(Masa masa) {
        if(masa.isLibera()) {
            if(debarasare.esteDebarasata()) {
                if(servetele.areServeteleNoi()) {
                    System.out.println(
                            "Clientul poate ocupa masa " + masa.getNumar());

                } else {
                    System.out.println("Nu exista servetele noi");
                }

            } else {
                System.out.println("Masa nu este debarasata");
            }

        } else {
            System.out.println("Nu exista masa libera");
        }
    }
}
