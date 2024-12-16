package abstractfactory;

public class BilgisayarMagaza {
    public static void main(String[] args) {
        LenovoFactory lenovoFactory = new LenovoFactory();
        Bilgisayar lenovo = lenovoFactory.getBilgisayar("Lenovo", "8 GB", 13);

        CasperFactory casperFactory = new CasperFactory();
        Bilgisayar casper = casperFactory.getBilgisayar("Casper", "16 GB", 16);

        System.out.println(lenovo);
        System.out.println(casper);
    }
}
