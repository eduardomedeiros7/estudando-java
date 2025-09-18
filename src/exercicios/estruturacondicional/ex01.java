package exercicios.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int number = sc.nextInt();
        if (number < 0){
            System.out.println("The number is negative");
        }else{
            System.out.println("The number is positive");
        }
        sc.close();
    }
}
