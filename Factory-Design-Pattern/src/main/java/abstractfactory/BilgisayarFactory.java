package abstractfactory;

public interface BilgisayarFactory {
    Bilgisayar getBilgisayar(String model, String ram, int boyut);
}
