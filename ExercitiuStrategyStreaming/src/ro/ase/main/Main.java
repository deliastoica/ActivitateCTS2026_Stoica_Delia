package ro.ase.main;

import ro.ase.clase.HD;
import ro.ase.clase.Utllizator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Utllizator utllizator=new Utllizator("Oana");
        utllizator.vizioneaza("Titanic");
        utllizator.setModalitateRedare(new HD());
        utllizator.vizioneaza("Titanic");
    }
}