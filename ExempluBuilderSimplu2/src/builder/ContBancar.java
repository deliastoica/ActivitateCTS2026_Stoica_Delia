package builder;

public class ContBancar {
    protected boolean  detineCard;
    protected boolean internetBanking;
    protected boolean smsAlert;
    protected String numeTitular;

    public ContBancar(boolean detineCard, boolean internetBanking, boolean smsAlert, String numeTitular) {
        this.detineCard = detineCard;
        this.internetBanking = internetBanking;
        this.smsAlert = smsAlert;
        this.numeTitular = numeTitular;
    }

    public void setDetineCard(boolean detineCard) {
        this.detineCard = detineCard;
    }

    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    public void setSmsAlert(boolean smsAlert) {
        this.smsAlert = smsAlert;
    }

    public void setNumeTitular(String numeTitular) {
        this.numeTitular = numeTitular;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBancar{");
        sb.append("detineCard=").append(detineCard);
        sb.append(", internetBanking=").append(internetBanking);
        sb.append(", smsAlert=").append(smsAlert);
        sb.append(", numeTitular='").append(numeTitular).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
