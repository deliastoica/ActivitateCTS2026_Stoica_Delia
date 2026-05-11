package ro.ase.clase;

public class Camera {
    private int numar;
    private boolean esteLibera;

    public Camera(int numar, boolean esteCuratata) {
        this.numar = numar;
        this.esteLibera = esteCuratata;
    }

    public int getNumar() {
        return numar;
    }

    public boolean EsteLibera() {
        return esteLibera;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Camera{");
        sb.append("numar=").append(numar);
        sb.append(", esteCuratata=").append(esteLibera);
        sb.append('}');
        return sb.toString();
    }
}
