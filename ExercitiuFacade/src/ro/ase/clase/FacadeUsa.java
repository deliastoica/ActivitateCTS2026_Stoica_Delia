package ro.ase.clase;

public class FacadeUsa {
    private Usa usaFata;
    private Usa usaMijloc;
    private Usa usaSpate;

    public FacadeUsa(Usa usaFata, Usa usaMijloc, Usa usaSpate) {
        this.usaFata = usaFata;
        this.usaMijloc = usaMijloc;
        this.usaSpate = usaSpate;
    }

    public void deschideToateUsileLiber() {

        usaFata.puneModLiber();
        usaMijloc.puneModLiber();
        usaSpate.puneModLiber();
    }

    public void deschideFortatToateUsile() {

        usaFata.deschideFortat();
        usaMijloc.deschideFortat();
        usaSpate.deschideFortat();
    }
}
