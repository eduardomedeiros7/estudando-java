package poo.encapsulamento.application;


import poo.encapsulamento.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextDouble();


        Product product = new Product(name, price);




        product.setName("Teclado");
        System.out.println("Update name: " + product.getName());
        product.setPrice(3000.00);
        System.out.println("Update price: " + product.getPrice());




        System.out.println("Product data: " + product);

        System.out.println("Enter the number of product to be added in stock:");
        int quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of product to be removed in stock:");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }
    }

