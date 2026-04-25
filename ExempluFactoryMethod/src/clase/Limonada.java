package clase;

public class Limonada extends BauturaRece{
    public Limonada(String denumire, float pret, int calori) {
        super(denumire, pret, calori);
    }

    @Override
    public void afisare() {
        System.out.println("O "+super.denumire+" costa"+ super.pret+" lei ");
    }
}
