package ro.ase.clase;

public class Carte {
    private String nume;
    private String autor;
    private boolean esteDisponibila;

    public Carte(String nume, String autor, boolean esteDisponibila) {
        this.nume = nume;
        this.autor = autor;
        this.esteDisponibila = esteDisponibila;
    }

    public boolean isEsteDisponibila() {
        return esteDisponibila;
    }

    public void setEsteDisponibila(boolean esteDisponibila) {
        this.esteDisponibila = esteDisponibila;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Carte{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", autor='").append(autor).append('\'');
        sb.append(", esteDisponibila=").append(esteDisponibila);
        sb.append('}');
        return sb.toString();
    }
}
