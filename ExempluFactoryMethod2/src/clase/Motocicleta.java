package clase;

public abstract class Motocicleta implements Vehicul{
    protected int an;
    protected String marca;
    protected String km;

    public Motocicleta(int an, String marca, String km) {
        this.an = an;
        this.marca = marca;
        this.km = km;
    }
}
