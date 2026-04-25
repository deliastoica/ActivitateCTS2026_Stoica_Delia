package clase;

public abstract class BauturaRece implements Bautura{
    protected String denumire;
    protected float pret;
    protected int calori;

    public BauturaRece(String denumire, float pret, int calori) {
        this.denumire = denumire;
        this.pret = pret;
        this.calori = calori;
    }
}
