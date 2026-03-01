package ro.ase.seminar1.animale;

public class Lion extends Animal{

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Lion " + name + " mananca " + mancare);
    }
}
