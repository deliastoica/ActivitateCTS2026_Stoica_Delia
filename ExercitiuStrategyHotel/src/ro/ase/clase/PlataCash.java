package ro.ase.clase;

public class PlataCash implements ModalitatePlata{
    @Override
    public void plateste(double suma) {
        System.out.println("A achitat suma de "+ suma+" cash");
    }
}
