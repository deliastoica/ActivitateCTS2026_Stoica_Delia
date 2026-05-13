package ro.ase.clase;

public class LivrareStandard {
    private String data;
    private String companie;

    public LivrareStandard(String data, String companie) {
        this.data = data;
        this.companie = companie;
    }

    public LivrareStandard() {

    }

    public void livreaza()
    {
        System.out.println("Comanda a fost livrata!");
    }
}
