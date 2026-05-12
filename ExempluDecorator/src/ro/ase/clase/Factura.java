package ro.ase.clase;

public class Factura implements FacturaAbstract {
    private double suma;
    private int nrNopti;

    public Factura(double suma, int nrNopti) {
        this.suma = suma;
        this.nrNopti = nrNopti;
    }

    @Override
    public void printeaza() {
        System.out.println("Costul sederii este de "+ suma*nrNopti);
    }
}
