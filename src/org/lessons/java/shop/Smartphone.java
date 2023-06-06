package org.lessons.java.shop;

public class Smartphone extends Product {
    private String imei;
    private int memory;

    public Smartphone(String name, String description, double price, int vat, String imei, int memory) {
        super(name, description, price, vat);
        this.imei = imei;
        this.memory = memory;
    }

    public String getImei() {
        return imei;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return "Smartphone{" + super.toString() +
                "imei='" + imei + '\'' +
                ", memory=" + memory +
                '}';
    }
}
