package main;

import clase.Bautura;
import clase.BauturaCalda;
import fabrici.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                BauturaFabrica bauturaFabrica1 = new BauturaCaldaFabrica();

                Bautura ceai = bauturaFabrica1.getBautura(
                        TipBauturaCalda.CEAI,
                        "Ceai verde",
                        11,
                        60
                );

                Bautura cafea = bauturaFabrica1.getBautura(
                        TipBauturaCalda.CAFEA,
                        "Espresso",
                        10,
                        50
                );

                ceai.afisare();
                cafea.afisare();


                BauturaFabrica bauturaFabrica2=new BauturaReceFabrica();
                Bautura limonada=bauturaFabrica2.getBautura(TipBauturaRece.LIMONADA, "Limonada cu menta", 20, 80);
                Bautura suc=bauturaFabrica2.getBautura(TipBauturaRece.SUC, "Fanta", 18, 200);
                limonada.afisare();
                suc.afisare();
            }
        }

