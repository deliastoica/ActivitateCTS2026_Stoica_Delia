package ro.ase.clase;

public class AdapterBar extends ProdusBucatarie{
    private ProdusBar produsBar;

    public AdapterBar(ProdusBar produsBar) {
        this.produsBar = produsBar;
    }

    @Override
    public void printeazaFactura() {
       produsBar.vindeProdusBar();
    }
}
