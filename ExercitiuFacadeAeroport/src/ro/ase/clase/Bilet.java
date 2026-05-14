package ro.ase.clase;

public class Bilet {
    private String numar;
    private boolean validare;

    public Bilet(String numar, boolean validare) {
        this.numar = numar;
        this.validare = validare;
    }

    public String getNumar() {
        return numar;
    }

    public boolean isValidare() {
        return validare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bilet{");
        sb.append("numar='").append(numar).append('\'');
        sb.append(", validare=").append(validare);
        sb.append('}');
        return sb.toString();
    }
}
