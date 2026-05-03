package ro.ase.flyweight.clase;

public class Pacient implements PacientAbstract{
    private String nume;
    private String nrTelefon;
    private String adresa;

    public Pacient(String nume, String nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    @Override
    public void afiseazaSectie(Sectie sectie) {
        System.out.println("Pacientul "+ nume+ " are nr de telefon "+nrTelefon+" si adresa" + adresa);
        System.out.println(sectie);
    }
}
