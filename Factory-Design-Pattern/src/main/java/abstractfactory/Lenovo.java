package abstractfactory;

import abstractfactory.Bilgisayar;

public class Lenovo implements Bilgisayar {

    private String model;
    private String ram;
    private int boyut;

    public Lenovo(String model, String ram, int boyut) {
        this.model = model;
        this.ram = ram;
        this.boyut = boyut;
    }

    @Override
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public int getBoyut() {
        return boyut;
    }

    public void setBoyut(int boyut) {
        this.boyut = boyut;
    }

    @Override
    public String toString() {
        return "Lenovo{" +
                "model='" + model + '\'' +
                ", ram='" + ram + '\'' +
                ", boyut=" + boyut +
                '}';
    }
}
