package ro.ase.seminar6.clase;

public class Papanasi extends Desert{
    public Papanasi(float gramaj, String denumire, int calorii) {
        super(gramaj, denumire, calorii);
    }

    @Override
    public void afisezaPret() {
        System.out.println("Papanasii "+super.denumire+" au "+super.gramaj+" grame "+" si "+super.calorii+" calorii");
    }
}
