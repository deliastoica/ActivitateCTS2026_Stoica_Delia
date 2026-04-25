package clase;

public class Produs implements iProdus{

    private String denumire;
    private float pret;
    private String categorie;

    private Produs() {
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public iProdus copiaza() {
        Produs produs=new Produs();
        produs.categorie=this.categorie;
        produs.pret=this.pret;
        produs.denumire=this.denumire;
        return produs;
    }

    public Produs(String denumire, float pret, String categorie) {
        this.denumire = denumire;
        this.pret = pret;
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produs{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", categorie='").append(categorie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
