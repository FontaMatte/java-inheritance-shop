package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Product product = new Product("Product 1.0", "Product 1.0 Description", 10.00, 22);

        System.out.println("Product Code: " + product.getCode());
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Description: " + product.getDescription());
        System.out.println("Product Price: " + product.getPrice() + "$");
        System.out.println("Product VAT: " + product.getVat() + "%");
        System.out.println("Product Price+VAT: " + product.getPriceVat() + "$");
        System.out.println("Product Code+Name: " + product.getExtendedName());
        System.out.println("Product Padded Code: " + product.getPaddedCode());

        // SET A NEW NAME AND NEW PRICE TO PRODUCT
        product.setName("Product 1.1");
        product.setDescription("Product 1.1 Description");
        product.setPrice(12.00);

        System.out.println("Product New Name: " + product.getName());
        System.out.println("Product New Description: " + product.getDescription());
        System.out.println("Product New Price: " + product.getPrice());
    }
}
