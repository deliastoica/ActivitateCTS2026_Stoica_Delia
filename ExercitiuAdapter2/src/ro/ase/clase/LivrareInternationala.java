package ro.ase.clase;

public class LivrareInternationala {
    private String data;
    private String companie;

    public LivrareInternationala(String data, String companie) {
        this.data = data;
        this.companie = companie;
    }

    public void livreaza()
    {
        System.out.println("Comanda a fost livrata!");
    }
}
