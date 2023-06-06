package org.lessons.java.shop;

import javax.swing.*;

public class Headphones extends Product{
    private String color;
    private boolean wireless;

    public Headphones(String name, String description, double price, int vat, String color, boolean wireless) {
        super(name, description, price, vat);
        this.color = color;
        this.wireless = wireless;
    }
    public String getColor() {
        return color;
    }

    public boolean isWireless() {
        return wireless;
    }
    @Override
    public String toString() {
        return "Headphones{" + super.toString() +
                "color='" + color + '\'' +
                ", wireless=" + wireless +
                '}';
    }
}
