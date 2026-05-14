package ro.ase.clase;

public class Calator {
    private String nume;
    private Plata plata;

    public Calator(String nume) {
        this.nume = nume;
        this.plata=new PlataAbonament();
    }

    public void setPlata(Plata plata) {
        this.plata = plata;
    }

    public void plateste(double suma)
    {
        plata.plateste(suma, this.nume);
    }
}
