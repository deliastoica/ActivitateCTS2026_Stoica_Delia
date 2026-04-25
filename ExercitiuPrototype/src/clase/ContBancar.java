package clase;

public class ContBancar implements iContBancar{
    private String numeTitular;
    private float sold;
    private String IBAN;

    private ContBancar() {
    }

    public void setNumeTitular(String numeTitular) {
        this.numeTitular = numeTitular;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }


    public ContBancar(String numeTitular, float sold, String IBAN) {
        this.numeTitular = numeTitular;
        if(sold>0)
           this.sold = sold;
        else this.sold=0;
        if(IBAN.length()==10)
           this.IBAN = IBAN;
        else this.IBAN="INVALID";
    }


    @Override
    public iContBancar copiaza() {
        ContBancar cont=new ContBancar();
        cont.numeTitular=this.numeTitular;
        cont.sold=this.sold;
        cont.IBAN=this.IBAN;
        return cont;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBancar{");
        sb.append("numeTitular='").append(numeTitular).append('\'');
        sb.append(", sold=").append(sold);
        sb.append(", IBAN='").append(IBAN).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
