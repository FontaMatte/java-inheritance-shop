package org.lessons.java.shop;

public class Tv extends Product{

    private int inches;
    private boolean smart;

    public Tv(String name, String description, double price, int vat, int inches, boolean smart) {
        super(name, description, price, vat);
        this.inches = inches;
        this.smart = smart;
    }
    public int getInches() {
        return inches;
    }

    public boolean isSmart() {
        return smart;
    }
    @Override
    public String toString() {
        return "Tv{" + super.toString() +
                "inches=" + inches +
                ", smart=" + smart +
                '}';
    }
}
