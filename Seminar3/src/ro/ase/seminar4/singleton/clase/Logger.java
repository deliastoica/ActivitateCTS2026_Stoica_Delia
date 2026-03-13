package ro.ase.seminar4.singleton.clase;

public class Logger {
    protected int cod;
    protected String sender;
    protected String categorie;
    private static Logger instance=null;

    private Logger(String sender, String categorie) {
        this.cod = 0;
        this.sender = sender;
        this.categorie = categorie;
    }


    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public static synchronized Logger getInstance(String sender, String categorie)
    {
        if(instance==null)
            instance=new Logger(sender, categorie);
        return instance;
    }

    public void afisareLog(String text)
    {
        System.out.println("Logul cu ID ul "+ cod +", efectuat de utilizatorul "+  sender+ " a constat in "+ text+" din categoria "+categorie);
        this.cod++;
    }
}
