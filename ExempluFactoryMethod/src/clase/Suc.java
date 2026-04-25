package clase;

public class Suc extends BauturaRece{
    public Suc(String denumire, float pret, int calori) {
        super(denumire, pret, calori);
    }

    @Override
    public void afisare() {
        System.out.println("O "+super.denumire+" costa"+ super.pret+" lei ");
    }
}
