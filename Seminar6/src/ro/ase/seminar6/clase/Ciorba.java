package ro.ase.seminar6.clase;

public class Ciorba extends Supa{
    public Ciorba(float gramaj, String denumire) {
        super(gramaj, denumire);
    }

    @Override
    public void afisezaPret() {
        System.out.println("Ciorba "+super.denumire+" are "+super.gramaj+" grame");
    }
}
