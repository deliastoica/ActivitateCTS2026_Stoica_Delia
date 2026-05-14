package ro.ase.clase;

public class PlataAbonament implements Plata{
    @Override
    public void plateste(double suma, String nume) {
        System.out.println("Clientul "+ nume+ " a achitat folosind abonamentul suma "+suma);
    }
}
