package pachetTuristic;

public class PachetTransport implements PachetTuristic{
    private String nume;

    public PachetTransport(String nume) {
        this.nume = nume;
    }

    @Override
    public void descrie() {
        System.out.println("Pachet doar cu transport");
    }
}
