package ro.ase.main;

import ro.ase.clase.Client;
import ro.ase.clase.IClient;
import ro.ase.proxy.ProxyClient;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IClient client=new Client("Andrei", true);
        IClient client2=new Client("Ana", false);
        ProxyClient proxyClient=new ProxyClient(client);
        proxyClient.rezerva();
        proxyClient=new ProxyClient(client2);
        proxyClient.rezerva();
    }
}