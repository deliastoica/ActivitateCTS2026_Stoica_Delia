package ro.ase.clase;

public class Client {
    private String nume;
    private String telefon;
    private ModalitatePlata modalitatePlata;

    public Client(String nume, String telefon) {
        this.nume = nume;
        this.telefon = telefon;
        this.modalitatePlata=new PlataCash();

    }

    public void setModalitatePlata(ModalitatePlata modalitatePlata) {
        this.modalitatePlata = modalitatePlata;
    }

    public void platesteFactura(double suma)
    {
        System.out.println("Clientul " + this.nume+" cu nr de telefon "+this.telefon);
        modalitatePlata.plateste(suma);
    }
}
