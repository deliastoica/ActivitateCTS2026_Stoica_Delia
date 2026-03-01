package ro.ase.seminar1.animale;

public class Zebra extends Animal{
    public Zebra(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat(String mancare) {
        System.out.println("Zebra " + name + " mananca " + mancare);
    }
}
