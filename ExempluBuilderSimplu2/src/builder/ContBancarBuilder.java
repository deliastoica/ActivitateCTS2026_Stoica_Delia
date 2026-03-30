package builder;

public class ContBancarBuilder implements ContBancarBuilderAbstract{
    private ContBancar cont;

    public ContBancarBuilder(String nume)
    {
        this.cont=new ContBancar(false, false, false, nume);
    }

    public ContBancarBuilder setDetineCard(boolean areCard) {
        this.cont.detineCard=areCard;
        return this;
    }

    public ContBancarBuilder setInternetBanking(boolean areinternetBanking) {
        this.cont.internetBanking = areinternetBanking;
        return this;
    }

    public ContBancarBuilder setSmsAlert(boolean aresmsAlert) {
        this.cont.smsAlert = aresmsAlert;
        return this;
    }

    public ContBancarBuilder setNumeTitular(String nume) {
        this.cont.numeTitular = nume;
        return this;
    }

    @Override
    public ContBancar build() {
        return this.cont;
    }
}
