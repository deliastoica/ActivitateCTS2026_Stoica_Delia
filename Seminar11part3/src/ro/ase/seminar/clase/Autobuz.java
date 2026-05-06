package ro.ase.seminar.clase;

public class Autobuz implements Command {
    private String producator;

    public Autobuz(String producator) {
        this.producator = producator;
    }

    public void pornestePeTraseu(int nrLinie)
    {
        System.out.println("Autobuzul "+producator+" porneste de la linia "+nrLinie);
    }

    @Override
    public void pleacaInCursa() {

    }
}
