package ro.ase.decorator;

import ro.ase.clase.FacturaAbstract;

public class FacturaAnNou extends FacturaDecorator {
    public FacturaAnNou(FacturaAbstract factura) {
        super(factura);
    }

    public void printeazaMesaj()
    {
        System.out.println("Sa aveti un nou an fericit!");
    }
}
