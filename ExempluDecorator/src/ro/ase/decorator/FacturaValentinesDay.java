package ro.ase.decorator;

import ro.ase.clase.FacturaAbstract;

public class FacturaValentinesDay extends FacturaDecorator{
    public FacturaValentinesDay(FacturaAbstract factura) {
        super(factura);
    }

    public void printeazaMesaj()
    {
        System.out.println("Sper ca ati avut un Valentine's Day fericit!");
    }
}
