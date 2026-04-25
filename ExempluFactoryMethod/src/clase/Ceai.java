package clase;

public class Ceai extends BauturaCalda{
    public Ceai(String denumire, float pret, int calori) {
        super(denumire, pret, calori);
    }

    @Override
    public void afisare() {
        System.out.println("O "+super.denumire+" costa"+ super.pret+" lei ");
    }
}
