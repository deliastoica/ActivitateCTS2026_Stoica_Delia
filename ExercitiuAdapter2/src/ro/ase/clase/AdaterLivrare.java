package ro.ase.clase;

public class AdaterLivrare extends LivrareStandard{

    private LivrareInternationala livrareInternationala;



    public AdaterLivrare(LivrareInternationala livrareInternationala) {
        super();

        this.livrareInternationala = livrareInternationala;
    }

    @Override
    public void livreaza() {
        livrareInternationala.livreaza();
    }
}
