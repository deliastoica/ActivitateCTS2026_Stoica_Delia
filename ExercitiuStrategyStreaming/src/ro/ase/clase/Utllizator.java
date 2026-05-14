package ro.ase.clase;

public class Utllizator {
    private String nume;
    private ModalitateRedare modalitateRedare;

    public Utllizator(String nume) {
        this.nume = nume;
        this.modalitateRedare=new Standard();
    }

    public void setModalitateRedare(ModalitateRedare modalitateRedare) {
        this.modalitateRedare = modalitateRedare;
    }

    public void vizioneaza(String film)
    {
        System.out.println("Filmul "+ film+ " este redat in calitatea ");
        modalitateRedare.reda(film);
    }
}
