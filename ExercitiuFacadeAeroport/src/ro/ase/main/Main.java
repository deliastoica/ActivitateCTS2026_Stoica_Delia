package ro.ase.main;

import ro.ase.clase.Bilet;
import ro.ase.clase.ControlDeSecuritate;
import ro.ase.clase.Document;
import ro.ase.facade.FacadeAeroport;

import javax.print.Doc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bilet bilet=new Bilet("123HG", false);
        ControlDeSecuritate controlDeSecuritate=new ControlDeSecuritate(true);
        Document document=new Document("Buletin", true);
        FacadeAeroport facadeAeroport=new FacadeAeroport(bilet, controlDeSecuritate, document);
        facadeAeroport.control();

    }
}