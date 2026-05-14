package ro.ase.clase;

public class Bilet implements IBilet{
    private String tip;

    public Bilet(String tip) {
        this.tip = tip;
    }

    @Override
    public void printeaza() {
       System.out.println("Biletul este de tipul "+this.tip );
    }
}
