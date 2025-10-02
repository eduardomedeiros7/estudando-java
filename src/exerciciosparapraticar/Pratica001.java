package exerciciosparapraticar;

import java.util.Locale;
import java.util.Scanner;

public class Pratica001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Product price: ");
        double originalPrice = sc.nextDouble();

        double discount;

        do {
            System.out.println("Enter the discount (0-100)");
            discount = sc.nextDouble();

            if (discount < 0 || discount > 100){
                System.out.println("Invalid discount. Try again.");
            }

        }while (discount < 0 || discount > 100);

        double discountAmount = originalPrice * (discount / 100);
        double finalPrice = originalPrice - discountAmount;
        System.out.printf("Original Price: R$ %.2f%n", originalPrice);
        System.out.printf("Discount Value (%.1f%%): R$ %.2f%n", discountAmount, discountAmount);
        System.out.printf("Final Price: R$ %.2f%n", finalPrice);

        sc.close();

    }
}
