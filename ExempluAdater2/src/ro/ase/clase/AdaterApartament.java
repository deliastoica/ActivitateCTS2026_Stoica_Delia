package ro.ase.clase;

public class AdaterApartament extends CameraHotel{
    private ApartamentPremium apartamentPremium;

    public AdaterApartament(ApartamentPremium apartamentPremium) {
        this.apartamentPremium = apartamentPremium;
    }

    @Override
    public void rezervaCamera() {
        apartamentPremium.inchiriazaApartament();
    }
}
