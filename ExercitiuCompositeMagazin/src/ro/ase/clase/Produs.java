package ro.ase.clase;

public class Produs implements Structura {
    private String denumire;
    private double pret;

    public Produs(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }


    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii+"Produsul "+this.denumire+" costa "+this.pret);
    }
}
