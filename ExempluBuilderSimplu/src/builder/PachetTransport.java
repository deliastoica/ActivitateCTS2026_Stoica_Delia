package builder;

public class PachetTransport {
    protected boolean WIFI;
    protected boolean TV;
    protected boolean AC;
    protected String numeClient;

    public PachetTransport(boolean WIFI, boolean TV, boolean AC, String numeClient) {
        this.WIFI = WIFI;
        this.TV = TV;
        this.AC = AC;
        this.numeClient = numeClient;
    }

    public void setWIFI(boolean WIFI) {
        this.WIFI = WIFI;
    }

    public void setTV(boolean TV) {
        this.TV = TV;
    }

    public void setAC(boolean AC) {
        this.AC = AC;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTransport{");
        sb.append("WIFI=").append(WIFI);
        sb.append(", TV=").append(TV);
        sb.append(", AC=").append(AC);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
