package ro.ase.main;

import ro.ase.clase.Autobuz;
import ro.ase.clase.IAutobuz;
import ro.ase.proxy.ProxyAutobuz;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IAutobuz autobuz1=new Autobuz(23, 0);
        ProxyAutobuz proxyAutobuz=new ProxyAutobuz(autobuz1);
        proxyAutobuz.opreste();
        IAutobuz autobuz2=new Autobuz(102, 11);
        ProxyAutobuz proxyAutobuz2=new ProxyAutobuz(autobuz2);
        proxyAutobuz2.opreste();
    }
}