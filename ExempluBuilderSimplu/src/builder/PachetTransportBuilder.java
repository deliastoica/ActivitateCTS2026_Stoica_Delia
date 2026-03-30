package builder;

public class PachetTransportBuilder implements PachetTransportBuilderAbstract {
    private PachetTransport pachet;

    public PachetTransportBuilder(String nume)
    {
        this.pachet=new PachetTransport(false, false, false, nume);
    }

    public PachetTransportBuilder setWIFI(boolean areWIFI) {
        pachet.WIFI=areWIFI;
        return this;
    }

    public PachetTransportBuilder setTV(boolean areTV) {
        pachet.TV=areTV;
        return this;
    }

    public PachetTransportBuilder setAC(boolean areAC) {
        pachet.AC=areAC;
        return this;
    }

    public PachetTransportBuilder setNumeClient(String nume) {
        pachet.numeClient=nume;
        return this;
    }

    @Override
    public PachetTransport build() {
        return this.pachet;
    }
}
