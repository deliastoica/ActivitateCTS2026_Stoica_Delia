package pachetTuristic;

public class PachetCazareTransport implements PachetTuristic{
    private String nume;

    public PachetCazareTransport(String nume) {
        this.nume = nume;
    }

    @Override
    public void descrie() {
        System.out.println("Pachet cu cazare si transport");
    }
}
