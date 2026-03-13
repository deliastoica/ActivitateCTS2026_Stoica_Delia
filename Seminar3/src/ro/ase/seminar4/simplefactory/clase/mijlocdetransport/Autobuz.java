package ro.ase.seminar4.simplefactory.clase.mijlocdetransport;

public class Autobuz implements MijlocDeTransport{

    private Integer nrLinie;
    private String marca;

    public Autobuz(Integer nrLinie, String marca) {
        this.nrLinie = nrLinie;
        this.marca = marca;
    }

    @Override
    public void afiseazaTipTransport() {
        StringBuilder sb = new StringBuilder();
        sb.append("autobuzul de pe linia ").append(this.nrLinie)
                .append(" este produs de ").append(this.marca);
        System.out.println(sb.toString());
    }
}
