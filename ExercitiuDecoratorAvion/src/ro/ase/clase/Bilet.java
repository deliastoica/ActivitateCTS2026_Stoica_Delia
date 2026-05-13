package ro.ase.clase;

public class Bilet implements IBilet{
    private String destinatie;
    private String data;

    public Bilet(String destinatie, String data) {
        this.destinatie = destinatie;
        this.data = data;
    }

    @Override
    public void printeaza() {
      System.out.println("Biletul spre "+this.destinatie+" este la data "+ this.data);
    }
}
