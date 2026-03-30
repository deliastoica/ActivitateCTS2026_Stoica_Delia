package builder;

public class PachetTransportAlternativ implements PachetTransportAbstractA {
    protected boolean WIFI;
    protected boolean TV;
    protected boolean AC;
    protected String numeClient;


    public PachetTransportAlternativ(String numeClient) {
        this.WIFI = false;
        this.TV = false;
        this.AC = false;
    }

    public PachetTransportAlternativ setWIFI(boolean WIFI) {
        this.WIFI = WIFI;
        return this;
    }

    public PachetTransportAlternativ setTV(boolean TV) {
        this.TV = TV;
        return this;
    }

    public PachetTransportAlternativ setAC(boolean AC) {
        this.AC = AC;
        return this;
    }

    public PachetTransportAlternativ setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }


    @Override
    public PachetTransport build(String nume) {
        PachetTransport pachetTransport=new PachetTransport(this.WIFI, this.TV, this.AC, nume);
        return pachetTransport;
    }
}
