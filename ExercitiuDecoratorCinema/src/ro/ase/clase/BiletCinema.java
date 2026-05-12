package ro.ase.clase;

public class BiletCinema implements BiletAbstract {
    private double pret;
    private String film;

    public BiletCinema(double pret, String film) {
        this.pret = pret;
        this.film = film;
    }

    @Override
    public void printeaza() {
        System.out.println("Bilet la filmul "+film+" costa "+pret);
    }
}
