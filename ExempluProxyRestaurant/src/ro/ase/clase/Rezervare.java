package ro.ase.clase;

public class Rezervare implements RezervareAbstract{
    private String nume;
    private String ora;
    private int nrPersoane;

    public Rezervare(String nume, String ora, int nrPersoane) {
        this.nume = nume;
        this.ora = ora;
        this.nrPersoane = nrPersoane;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    @Override
    public void reazlizeazaRezervare() {
        System.out.println("Rezervare facuta de "+ this.nume+ " este la ora "
                +this.ora+" si este pentru "+ this.nrPersoane+ " persoane");

    }

    @Override
    public int getNrPersone() {
        return this.nrPersoane;
    }
}
