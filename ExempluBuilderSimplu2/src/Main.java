import builder.ContBancar;
import builder.ContBancarBuilder;
import builder.ContBancarBuilderAbstractA;
import builder.ContBancarBuilderAlternativ;

import java.util.concurrent.Callable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContBancar cont1=new ContBancar(true, false, false, "Antonio Pop");
        ContBancar cont2=new ContBancar(false, true, true, "Simon Rin");
        ContBancarBuilder builder=new ContBancarBuilder("Antonio Pop");
        ContBancar cont3=builder.build();
        System.out.println(cont1);
        System.out.println(cont2);
        System.out.println(cont3);
        cont3=builder.setDetineCard(false).setInternetBanking(false).setSmsAlert(false).build();
        System.out.println(cont3);


        ContBancarBuilderAlternativ builderAlternativ=new ContBancarBuilderAlternativ("Antonio Pop");
        builderAlternativ.setInternetBanking(true);
        builderAlternativ.setDetineCard(false);
        ContBancar cont4=builderAlternativ.build("Antonio Pop");
        System.out.println(cont4);


    }
}