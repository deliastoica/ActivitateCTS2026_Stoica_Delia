package ro.ase.proxy;

import ro.ase.clase.IClient;

public class ProxyClient implements IClient {
    private IClient client;

    public ProxyClient(IClient client) {
        this.client = client;
    }

    @Override
    public void rezerva() {
      if(client.isAbonamentPremiun())
          client.rezerva();
      else
          System.out.println("Rezervarea se poate face decat de catre clientii premium!");
    }

    @Override
    public boolean isAbonamentPremiun() {
        return false;
    }
}
