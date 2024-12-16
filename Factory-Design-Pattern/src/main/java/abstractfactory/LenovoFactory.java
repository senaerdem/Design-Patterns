package abstractfactory;

public class LenovoFactory implements BilgisayarFactory {
    @Override
    public Bilgisayar getBilgisayar(String model, String ram, int boyut) {
        return new Lenovo(model, ram, boyut);
    }
}
