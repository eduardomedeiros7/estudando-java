package orientacaoobjetos.application;

import orientacaoobjetos.application.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock");
        product.quantity = sc.nextInt();

        System.out.println("Product data: " + product);

        System.out.println("Enter the number of product to be added in stock:");
        int quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of product to be removed in stock:");
        quantity = sc.nextInt();
        product.removeProduct(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);










        sc.close();

    }
}
