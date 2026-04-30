package ro.ase.seminar9.clase;

public class PlataCard implements ModalitatePlata{
    @Override
    public void plateste(String numeClient, double suma) {
        System.out.println("Clientul cu numele "+ numeClient+ " a platit "+suma+" cu cardul");
    }
}
