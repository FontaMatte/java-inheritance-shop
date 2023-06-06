package org.lessons.java.shop;

public class Smartphone extends Product {
    private int imei;
    private int memory;

    public Smartphone(String name, String description, double price, int vat, int imei) {
        super(name, description, price, vat);
        this.imei = imei;
        this.memory = memory;
    }

    public int getImei() {
        return imei;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "imei=" + imei +
                ", memory=" + memory +
                '}';
    }
}
