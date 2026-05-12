package ro.ase.decorator;

import ro.ase.clase.FacturaAbstract;

public abstract class FacturaDecorator implements FacturaAbstract {
    protected FacturaAbstract factura;

    public FacturaDecorator(FacturaAbstract factura) {
        this.factura = factura;
    }

    @Override
    public void printeaza() {
         factura.printeaza();
    }
    public abstract void printeazaMesaj();
}
