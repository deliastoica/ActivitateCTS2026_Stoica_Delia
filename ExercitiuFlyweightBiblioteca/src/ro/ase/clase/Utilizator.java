package ro.ase.clase;

public class Utilizator implements UtilizatorAbstract{
    private String nume;
    private String nrTelefon;
    private String mail;

    public Utilizator(String nume, String nrTelefon, String mail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.mail = mail;
    }


    @Override
    public void imprumuta(Imprumut imprumut) {
        System.out.println("Utilizatorul " + this.nume+" a imprumutat cartea cu titlul "
                + imprumut.getTitlu()+" si are ca termen "+imprumut.getTermenZile()+" zile");

    }
}
