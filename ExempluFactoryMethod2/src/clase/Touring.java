package clase;

public class Touring extends Motocicleta{
    public Touring(int an, String marca, String km) {
        super(an, marca, km);
    }

    @Override
    public void afisareInformatii() {
        System.out.println("Motocicleta de la marca "+marca+" din anul "+an+" are "+km+" kilometrii");
    }
}
