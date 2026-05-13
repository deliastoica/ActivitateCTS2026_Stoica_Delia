package ro.ase.proxy;

import ro.ase.clase.IAutobuz;

public class ProxyAutobuz implements IAutobuz {
    private IAutobuz autobuz;

    public ProxyAutobuz(IAutobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public int getNrPersoane() {
        return autobuz.getNrPersoane();
    }

    @Override
    public void opreste() {
        if(autobuz.getNrPersoane()>0)
            autobuz.opreste();
        else
            System.out.println("Nu sunt persoane in autobuz. Se retrage.");
    }


}
