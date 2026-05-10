package ro.ase.seminar7.adapter.main;

import ro.ase.seminar7.adapter.aplicatie_farmacie.AdaptorMedicamentSpital;
import ro.ase.seminar7.adapter.aplicatie_farmacie.MedicamentFarmacie;
import ro.ase.seminar7.adapter.aplicatie_spital.MedicamentSpital;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void realizeazaAchizitie(MedicamentFarmacie medicament){
        medicament.cumparaMedicament();
    }
    public static void main(String[] args) {
        MedicamentSpital paracetamol = new MedicamentSpital();
        MedicamentFarmacie nurofen = new MedicamentFarmacie();

        paracetamol.achizitioneazaMedicament();
        nurofen.cumparaMedicament();

        realizeazaAchizitie(nurofen);
        //realizeazaAchizitie(paracetamol); - Adapter ar permite aceasta transformare

        AdaptorMedicamentSpital paracetamolAdaptat = new AdaptorMedicamentSpital(paracetamol);
        realizeazaAchizitie(paracetamolAdaptat);
    }
}