package ro.ase.seminar6.clase;

public class Clatite extends Desert{
    public Clatite(float gramaj, String denumire, int calorii) {
        super(gramaj, denumire, calorii);
    }


    @Override
    public void afisezaPret() {
        System.out.println("Clatitele "+super.denumire+" au "+super.gramaj+" grame "+" si "+super.calorii+" calorii");
    }
}
