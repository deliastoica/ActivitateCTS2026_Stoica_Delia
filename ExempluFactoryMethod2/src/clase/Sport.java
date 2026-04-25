package clase;

public class Sport extends Motocicleta{
    public Sport(int an, String marca, String km) {
        super(an, marca, km);
    }

    @Override
    public void afisareInformatii() {
        System.out.println("Motocicleta de la marca "+marca+" din anul "+an+" are "+km+" kilometrii");

    }
}
