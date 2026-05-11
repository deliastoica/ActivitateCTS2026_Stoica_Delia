package ro.ase.clase;

public class Masa {
    private String numar;
    private boolean libera;

    public Masa(String numar, boolean libera) {
        this.numar = numar;
        this.libera = libera;
    }

    public boolean isLibera() {
        return libera;
    }

    public String getNumar() {
        return numar;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa{");
        sb.append("numar='").append(numar).append('\'');
        sb.append(", libera=").append(libera);
        sb.append('}');
        return sb.toString();
    }
}
