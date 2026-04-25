package clase;

public class SUV extends Masina{
    public SUV(int an, String marca, String km) {
        super(an, marca, km);
    }

    @Override
    public void afisareInformatii() {
        System.out.println("Masina de la marca "+marca+" din anul "+an+" are "+km+" kilometrii");
    }
}
