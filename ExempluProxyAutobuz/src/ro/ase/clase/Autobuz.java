package ro.ase.clase;

public class Autobuz implements IAutobuz{
    private int linie;
    private int nrPersoane;

    public Autobuz(int linie, int nrPersoane) {
        this.linie = linie;
        this.nrPersoane = nrPersoane;
    }

    @Override
    public void opreste() {
      System.out.println("Autobuzul "+ this.linie+" si in acesta se afla "+ this.nrPersoane+" calatori");
    }

    @Override
    public int getNrPersoane() {
        return this.nrPersoane;
    }
}
