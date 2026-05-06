package ro.ase.seminar.clase;

public class Plecare implements Command{
    private int nrLinie;
    private Autobuz autobuz;
    @Override
    public void pleacaInCursa() {
        autobuz.pornestePeTraseu(nrLinie);
    }

    public Plecare( Autobuz autobuz, int nrLinie) {
        this.nrLinie = nrLinie;
        this.autobuz = autobuz;
    }
}
