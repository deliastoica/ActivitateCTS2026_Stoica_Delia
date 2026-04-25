package clase;

public abstract class Masina implements Vehicul{
    protected int an;
    protected String marca;
    protected String km;

    public Masina(int an, String marca, String km) {
        this.an = an;
        this.marca = marca;
        this.km = km;
    }
}
