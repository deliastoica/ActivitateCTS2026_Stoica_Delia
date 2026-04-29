package ro.ase.seminar8.clase;

public class NotaDePlata implements NotaDePlataAbstract{
    private float suma;
    private String data;

    public NotaDePlata(float suma, String data) {
        this.suma = suma;
        this.data = data;
    }

    @Override
    public void printeaza() {
       System.out.println("\nA fost achitata suma de "+suma+" la data "+data);
    }
}
