package ro.ase.facade;

import ro.ase.clase.Bilet;
import ro.ase.clase.ControlDeSecuritate;
import ro.ase.clase.Document;

public class FacadeAeroport {
    private Bilet bilet;
    private ControlDeSecuritate controlDeSecuritate;
    private Document document;

    public FacadeAeroport(Bilet bilet, ControlDeSecuritate controlDeSecuritate, Document document) {
        this.bilet = bilet;
        this.controlDeSecuritate = controlDeSecuritate;
        this.document = document;
    }

    public void control()
    {
        if(bilet.isValidare())
        {
            if(controlDeSecuritate.isControlat())
            {
                if(document.isValid())
                    System.out.println("Pasagerul se poate imbarca");
                else System.out.println("Documentul nu este valid");
            }
            else {
                System.out.println("Controlul nu a fost trecut");
            }

        }
        else System.out.println("Biletul nu este valid");
    }
}
