package ro.ase.main;

import ro.ase.clase.Client;
import ro.ase.clase.PlataCard;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Client client=new Client("Ana", "0746790752");
        client.platesteFactura(500.00);
        client.setModalitatePlata(new PlataCard());
        client.platesteFactura(590.00);
    }
}