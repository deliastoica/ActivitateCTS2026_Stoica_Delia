package ro.ase.clase;

public class Client implements IClient{
    private String nume;
    private boolean abonamentPremiun;

    public Client(String nume, boolean abonamentPremiun) {
        this.nume = nume;
        this.abonamentPremiun = abonamentPremiun;
    }



    @Override
    public void rezerva() {
        System.out.println("Clientul "+ " a rezervat sala VIP");
    }

    @Override
    public boolean isAbonamentPremiun() {
        return this.abonamentPremiun;
    }
}
