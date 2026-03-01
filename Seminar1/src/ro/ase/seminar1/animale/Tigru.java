package ro.ase.seminar1.animale;

public class Tigru extends Animal{
    private String rasa;

    public Tigru(String name, int age, String rasa) {
        super(name, age);
        this.rasa = rasa;
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Tigru " + name + " mananca " + mancare);
    }
}
