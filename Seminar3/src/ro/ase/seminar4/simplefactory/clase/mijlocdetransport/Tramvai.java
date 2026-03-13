package ro.ase.seminar4.simplefactory.clase.mijlocdetransport;

public class Tramvai implements MijlocDeTransport{
    private Integer nrLinie;
    private String marca;

    public Tramvai(String marca, Integer nrLinie) {
        this.marca = marca;
        this.nrLinie = nrLinie;
    }

    @Override
    public void afiseazaTipTransport() {
        StringBuilder sb = new StringBuilder();
        sb.append("tramvaiul de pe linia ").append(this.nrLinie)
                .append(" este produs de ").append(this.marca);
        System.out.println(sb.toString());
    }
}
