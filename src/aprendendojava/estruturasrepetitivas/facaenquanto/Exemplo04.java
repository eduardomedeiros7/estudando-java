package aprendendojava.estruturasrepetitivas.facaenquanto;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        char userResponse;

        do {
            System.out.println("Enter some numbers and find out their total sum");
            int  number = sc.nextInt();
            sum += number;
            System.out.println("Current sum: " + sum);
            System.out.println("Do you want to add more numbers(y/n)?");
            userResponse = sc.next().toUpperCase().charAt(0);
        }while (userResponse == 'Y');
        System.out.println("Total: " + sum);
        sc.close();
    }
}
