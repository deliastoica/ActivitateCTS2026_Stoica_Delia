package ro.ase.seminar5.main;

import ro.ase.seminar5.builder.Internare;
import ro.ase.seminar5.builder.InternareBuilder;
import ro.ase.seminar5.builder.InternareBuilderAlternativ;

public class Main {
    public static void main(String[] args)
    {
        Internare internare=new Internare(true, true, false, true, "Mihai Popa");
        Internare internare2=new Internare(false, false, false, false, "Ana Pop");
        InternareBuilder builder=new InternareBuilder("Ana Pop");
        Internare internare3=builder.built();
        Internare internare4=builder.setNume("Andrei Matei").setPat(true).setPapuci(true).setHalat(true).setMic(true).built();
        System.out.println(internare3.toString());
        System.out.println(internare4.toString());

        InternareBuilderAlternativ builderAlternativ=new InternareBuilderAlternativ("Popescu Ion");
        builderAlternativ.setMicDejun(true);
        Internare internare101=builderAlternativ.built("Ana");
        Internare internare102=builderAlternativ.built("Georgescu Alin");

        System.out.println(internare101.toString());
        System.out.println(internare102.toString());






    }
}
