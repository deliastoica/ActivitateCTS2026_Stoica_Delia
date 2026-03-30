package pachetTuristic;

public class PachetCazare implements PachetTuristic{
    private String nume;

    public PachetCazare(String nume) {
        this.nume = nume;
    }

    @Override
    public void descrie() {
        System.out.println("Pachet doar cu cazare");
    }
}
