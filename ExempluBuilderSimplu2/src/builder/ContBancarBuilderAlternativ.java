package builder;

public class ContBancarBuilderAlternativ implements ContBancarBuilderAbstractA {
    protected boolean  detineCard;
    protected boolean internetBanking;
    protected boolean smsAlert;
    protected String numeTitular;

    public ContBancarBuilderAlternativ(String numeTitular) {
        this.detineCard = false;
        this.internetBanking = false;
        this.smsAlert = false;
    }

    public ContBancarBuilderAlternativ setDetineCard(boolean detineCard) {
        this.detineCard = detineCard;
        return this;
    }

    public ContBancarBuilderAlternativ setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
        return this;
    }

    public ContBancarBuilderAlternativ setSmsAlert(boolean smsAlert) {
        this.smsAlert = smsAlert;
        return this;
    }

    public ContBancarBuilderAlternativ setNumeTitular(String numeTitular) {
        this.numeTitular = numeTitular;
        return this;
    }

    @Override
    public ContBancar build(String nume) {
        ContBancar cont=new ContBancar(this.detineCard, this.internetBanking, this.smsAlert, nume);
        return cont;
    }
}
