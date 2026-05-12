package ro.ase.main;

import ro.ase.clase.Factura;
import ro.ase.clase.FacturaAbstract;
import ro.ase.decorator.FacturaAnNou;
import ro.ase.decorator.FacturaDecorator;
import ro.ase.decorator.FacturaValentinesDay;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FacturaAbstract factura1=new Factura(3, 280);
        FacturaAbstract factura2=new Factura(2, 340);
        factura1.printeaza();
        factura2.printeaza();
        FacturaDecorator facturaDecorator=new FacturaValentinesDay(factura1);
        FacturaDecorator facturaDecorator1=new FacturaAnNou(factura2);
        facturaDecorator.printeazaMesaj();
        facturaDecorator1.printeazaMesaj();
    }
}