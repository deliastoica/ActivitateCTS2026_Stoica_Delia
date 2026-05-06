package ro.ase.seminar.clase;

public class Student {
    private ModSustinere modSustinere;
    private String nume;

    public Student(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public Student(String nume) {
        this.modSustinere=new Grila();
        this.nume=nume;
    }

    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void examinare() {
        modSustinere.sustinereExamen();
    }
}
