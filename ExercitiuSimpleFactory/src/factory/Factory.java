package factory;

import pachetTuristic.*;

public class Factory {
    public PachetTuristic createInstance(TipPachet tip, String nume)
    {
        switch(tip){
            case TipPachet.PACHET_CAZARE-> {
                return new PachetCazare(nume);
            }
            case TipPachet.PACHET_TRANSPORT ->{
                return new PachetTransport(nume);}
            case TipPachet.PACHET_CAZARE_TRANSPORT -> {
                return new PachetCazareTransport(nume);
            }
            default -> {
                return null;
            }
    }

    }


}
