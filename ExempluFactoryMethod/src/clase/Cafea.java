package clase;

public class Cafea extends BauturaCalda{
    public Cafea(String denumire, float pret, int calori) {
        super(denumire, pret, calori);
    }

    @Override
    public void afisare() {
        System.out.println("O "+super.denumire+" costa"+ super.pret+" lei ");

    }
}
