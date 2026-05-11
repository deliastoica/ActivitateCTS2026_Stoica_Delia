package ro.ase.clase;

public class AdaterBiletTren extends BiletAutobuz{
    private BiletTren biletTren;

    public AdaterBiletTren(BiletTren biletTren) {
        this.biletTren = biletTren;
    }

    @Override
    public void emiteBilet() {
        biletTren.rezervaBiletTren();
    }
}
