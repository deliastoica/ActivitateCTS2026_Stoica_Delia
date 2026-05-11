package ro.ase.clase.clase;

public class Sala {
    private int numar;
    private boolean locuriLibere[] = new boolean[100];

    public Sala(int numar) {
        this.numar = numar;
        this.locuriLibere = locuriLibere;
        locuriLibere[2] = true;
        locuriLibere[14] = true;
        locuriLibere[22] = true;
        locuriLibere[23] = true;
        locuriLibere[38] = true;
        locuriLibere[47] = true;
    }

    public boolean suntLocuriLibere() {
        for (int i = 0; i < locuriLibere.length; i++) {
            if (locuriLibere[i]) {
                return true;
            }

        }
         return false;
    }

    public void ocupaLoc(int i)
    {
        locuriLibere[i]=true;
    }
}
