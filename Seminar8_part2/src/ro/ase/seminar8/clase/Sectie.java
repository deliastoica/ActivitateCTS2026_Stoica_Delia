package ro.ase.seminar8.clase;

public class Sectie implements Structura{
    private String nume;
    private int nrAngajati;

    public Sectie(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }

    public String getNume() {
        return nume;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    @Override
    public void afiseazaDetaliiStrcutura(String spatii) {
     System.out.println(spatii+"Numele este "+nume+" si are nr de angajati "+nrAngajati);
    }
}
