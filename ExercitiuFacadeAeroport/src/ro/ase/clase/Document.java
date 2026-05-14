package ro.ase.clase;

public class Document {
    private String tip;
    private boolean valid;

    public String getTip() {
        return tip;
    }

    public boolean isValid() {
        return valid;
    }

    public Document(String tip, boolean valid) {
        this.tip = tip;
        this.valid = valid;
    }
}
