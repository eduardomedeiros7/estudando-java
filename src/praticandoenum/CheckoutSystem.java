package praticandoenum;

import java.util.Locale;
import java.util.Scanner;

public class CheckoutSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        try{
            System.out.println("Enter product price: ");
            double originalPrice = sc.nextDouble();

            System.out.println("Enter membership level (STANDARD, SILVER, GOLD, PLATINUM):");
            String inputLevel = sc.next().toUpperCase();

            MemberShipLevel level = MemberShipLevel.valueOf(inputLevel);

            double discount = level.getDiscountRate();
            double finalPrice = originalPrice * (1 - discount);

            System.out.println("--- Checkout Summary ---");
            System.out.println("Membership: " + level);
            System.out.printf("Discount applied: %.0f%%%n", discount * 100);
            System.out.printf("Final price: $%.2f%n", finalPrice);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: Invalid membership level entered.");
        } catch (Exception e) {
            System.out.println("Error: Please enter valid numbers.");
        } finally {
            sc.close();
        }
    }


}


