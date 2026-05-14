package ro.ase.clase;

public class Profesor implements Structura{
    private String nume;

    public Profesor(String nume) {
        this.nume = nume;
    }

    @Override
    public void contine(String spatii) {
        System.out.println(spatii+ "Profesorul "+this.nume);
    }
}
