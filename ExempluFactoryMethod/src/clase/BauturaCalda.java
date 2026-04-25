package clase;

public abstract class BauturaCalda implements Bautura {
    protected String denumire;
    protected float pret;
    protected int calori;

    public BauturaCalda(String denumire, float pret, int calori) {
        this.denumire = denumire;
        this.pret = pret;
        this.calori = calori;
    }
}
