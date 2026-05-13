package ro.ase.main;

import ro.ase.clase.Rezervare;
import ro.ase.clase.RezervareAbstract;
import ro.ase.proxy.ProxyRezervare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RezervareAbstract rezervare1=new Rezervare("Ionut", "18:30", 3);
        ProxyRezervare proxyRezervare=new ProxyRezervare(rezervare1);
        proxyRezervare.reazlizeazaRezervare();
        RezervareAbstract rezervare2=new Rezervare("Gigel", "17:50", 5);
        ProxyRezervare proxyRezervare1=new ProxyRezervare(rezervare2);
        proxyRezervare1.reazlizeazaRezervare();}
}