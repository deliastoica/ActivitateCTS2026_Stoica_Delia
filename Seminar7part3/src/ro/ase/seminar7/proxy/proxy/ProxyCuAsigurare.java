package ro.ase.seminar7.proxy.proxy;

import ro.ase.seminar7.proxy.clase.ISpital;
import ro.ase.seminar7.proxy.clase.Pacient;

public class ProxyCuAsigurare implements ISpital {
    private ISpital spital;

    @Override
    public void interneazaPacient(Pacient pacient) {
        if(pacient.isAreAsigurare()){
            spital.interneazaPacient(pacient);
        } else{
            System.out.println("Pacientul nu are asigurare");
        }
    }

    public ProxyCuAsigurare(ISpital spital) {
        this.spital = spital;
    }
}
