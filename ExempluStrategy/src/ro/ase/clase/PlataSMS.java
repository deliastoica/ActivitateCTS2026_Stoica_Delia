package ro.ase.clase;

public class PlataSMS implements Plata{
    @Override
    public void plateste(double suma, String nume) {
        System.out.println("Clientul "+ nume+ " a achitat folosind prin SMS suma de "+suma);
    }
}
