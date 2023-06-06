package org.lessons.java.shop;

import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product[] cart = new Product[10];
        int cartIndex = 0;

        boolean flag = true;

        while (flag) {
            System.out.println("which product do you want to add?");
            System.out.println("1. Smartphone");
            System.out.println("2. Television");
            System.out.println("3. Headphones");
            System.out.println("4. Exit");

            System.out.println("choice (Enter the number): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Insert the Brand of the smartphone: ");
                    String smartphoneName = scanner.nextLine();
                    System.out.println("Insert the description: ");
                    String smartphoneDescription =  scanner.nextLine();
                    System.out.println("Insert the Price of the smartphone: ");
                    double smartphonePrice = scanner.nextDouble();
                    System.out.println("Insert the VAT: ");
                    int smartphoneVAT =  scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Insert Smartphone IMEI: ");
                    String smartphoneIMEI = scanner.nextLine();
                    System.out.println("Insert the Smartphone memory(in GB): ");
                    int smartphoneGB =  scanner.nextInt();

                    Smartphone smartphone = new Smartphone(smartphoneName, smartphoneDescription, smartphonePrice, smartphoneVAT, smartphoneIMEI, smartphoneGB);
                    cart[cartIndex] = smartphone;
                    cartIndex++;
                    break;

                case 2:
                    scanner.nextLine();
                    System.out.println("Insert the Brand of the Television: ");
                    String televisionName = scanner.nextLine();
                    System.out.println("Insert the description: ");
                    String televisionDescription =  scanner.nextLine();
                    System.out.println("Insert the Price of the smartphone: ");
                    double televisionPrice = scanner.nextDouble();
                    System.out.println("Insert the VAT: ");
                    int televisionVAT =  scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Insert Television inches: ");
                    int televisionInches = scanner.nextInt();
                    System.out.println("The Television is Smart? yes/no ");
                    String smartInput = scanner.nextLine();
                    boolean smartTelevision = smartInput.equals("yes");

                    Tv television = new Tv(televisionName, televisionDescription, televisionPrice, televisionVAT, televisionInches, smartTelevision);
                    cart[cartIndex] = television;
                    cartIndex++;
                    break;

                case 3:
                    scanner.nextLine();
                    System.out.println("Insert the Brand of the Headphones: ");
                    String headphonesName = scanner.nextLine();
                    System.out.println("Insert the description: ");
                    String headphonesDescription =  scanner.nextLine();
                    System.out.println("Insert the Price of the headphones: ");
                    double headphonesPrice = scanner.nextDouble();
                    System.out.println("Insert the VAT: ");
                    int headphonesVAT =  scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Insert Headphones color: ");
                    String headphonesColor = scanner.nextLine();
                    System.out.println("The Headphones is Wireless? yes/no ");
                    String wirelessInput = scanner.nextLine();
                    boolean wirelessHeadphones = wirelessInput.equals("yes");

                    Headphones headphones = new Headphones(headphonesName, headphonesDescription, headphonesPrice, headphonesVAT, headphonesColor, wirelessHeadphones);
                    cart[cartIndex] = headphones;
                    cartIndex++;
                    break;

                case 4:
                    flag = false;
                    break;
            }

            System.out.println("cart content: ");

            for (int i = 0; i < cartIndex; i++) {
                System.out.println(cart[i]);
            }
        }
        scanner.close();
    }
}
