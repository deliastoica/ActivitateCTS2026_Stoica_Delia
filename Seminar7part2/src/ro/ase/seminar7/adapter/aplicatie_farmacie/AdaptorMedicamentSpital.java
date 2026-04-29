package ro.ase.seminar7.adapter.aplicatie_farmacie;

import ro.ase.seminar7.adapter.aplicatie_spital.MedicamentSpital;

public class AdaptorMedicamentSpital extends MedicamentFarmacie{
    MedicamentSpital medicamentSpital;

    public AdaptorMedicamentSpital(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
