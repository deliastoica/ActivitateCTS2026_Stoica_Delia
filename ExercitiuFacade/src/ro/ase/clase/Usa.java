package ro.ase.clase;

public class Usa {
    private String pozitie;

    public Usa(String pozitie) {
        this.pozitie = pozitie;
    }

    public void puneModLiber() {
        System.out.println(
                "Usa " + pozitie +
                        " este in mod liber");
    }

    public void deschideFortat() {
        System.out.println(
                "Usa " + pozitie +
                        " a fost deschisa fortat");
    }
}
