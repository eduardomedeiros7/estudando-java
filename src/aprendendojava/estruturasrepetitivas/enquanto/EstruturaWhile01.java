package aprendendojava.estruturasrepetitivas.enquanto;

import java.util.Scanner;

public class EstruturaWhile01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number until you enter the winning amount:");
        int value = sc.nextInt();
        int counter = 0;

        while (value!= 0){
             counter += + value;
            System.out.println("Try again");
            value = sc.nextInt();
        }
        System.out.println(counter);
        sc.close();
    }
}
