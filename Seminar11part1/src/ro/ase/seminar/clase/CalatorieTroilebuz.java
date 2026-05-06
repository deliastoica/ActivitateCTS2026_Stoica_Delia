package ro.ase.seminar.clase;

public class CalatorieTroilebuz extends CalatorieHandler{

    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta<3) {
            return "Troilebuz";
        }
       return super.succesor.recomandaCalatorie(distanta);

    }
}
