package org.lessons.java.shop;

import java.util.Random;

public class Product {

    private final int code;
    private String name;
    private String description;
    private double price;
    private int vat;

    public Product(String name, String description, double price, int vat) {
        this.code = generateRandomCode();
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }

    // RANDOM NUMBER GENERATOR FOR CODE
    private int generateRandomCode() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(1000000000);
    }

    // GETTERS SETTERS
    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getVat() {
        return this.vat;
    }
    public void setVat(int vat) {
        this.vat = vat;
    }

    // PRICE + VAT CALCULATOR METHOD
    public double getPriceVat() {
        return price + (price * vat / 100);
    }

    // EXTENDED NAME + CODE METHOD
    public String getExtendedName() {
        return code + " " + name;
    }

    // PAD LEFT METHOD
    public String getPaddedCode() {
        return String.format("%08d", code);
    }

    public double getDiscountedPrice() {
        return price;
    }

    public void fidelityDiscount() {
            double discount = 0.02;
            price -= (price * discount);
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", vat=" + vat +
                '}';
    }
}
