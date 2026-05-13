package ro.ase.clase;

public class Imprumut {
    private String titlu;
    private String data;
    private int termenZile;

    public Imprumut(String titlu, String data, int termenZile) {
        this.titlu = titlu;
        this.data = data;
        this.termenZile = termenZile;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getData() {
        return data;
    }

    public int getTermenZile() {
        return termenZile;
    }
}
