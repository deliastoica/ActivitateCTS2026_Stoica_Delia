package ro.ase.clase;

public class Banca {
    private String numeBanca;
    private float soldTotal;
    private static Banca instance=null;

    private Banca(String numeBanca, float soldTotal) {
        this.numeBanca = numeBanca;
        this.soldTotal = soldTotal;
    }

    public void setNumeBanca(String numeBanca) {
        this.numeBanca = numeBanca;
    }

    public void setSoldTotal(float soldTotal) {
        this.soldTotal = soldTotal;
    }

    public static synchronized Banca getInstance(String numeBanca, float soldTotal)
    {
        if(instance==null)
            instance=new Banca(numeBanca, soldTotal);
        return instance;

    }

    public void depune(float suma)
    {
         this.soldTotal+=suma;
    }

    public void afisare()
    {
        System.out.println("\nLa banca "+this.numeBanca+" are in cont "+this.soldTotal+" lei");
    }
}
