package ro.ase.clase;

public class Item implements Structura{
    private String denumire;
    private double pret;

    public Item(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii+"Produsul "+this.denumire+ " costa "+this.pret);
    }
}
