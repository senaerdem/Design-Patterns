package abstractfactory;

public class CasperFactory implements BilgisayarFactory {
    @Override
    public Bilgisayar getBilgisayar(String model, String ram, int boyut) {
        return new Casper(model, ram, boyut);
    }
}
