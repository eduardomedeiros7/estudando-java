package exercicios.estruturacondicional;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value:");
        int value = sc.nextInt();

        if (value < 0.0 || value > 100.0){
            System.out.println("Out of range");
        }
        else if (value <= 25){
            System.out.println("Interval:(0,25)");
        }
        else if (value <= 50.0){
            System.out.println("Interval:(25,50)");
        }
        else if (value <= 75.0){
            System.out.println("Interval:(50,75");
        }
        else{
            System.out.println("Interval:(75,100)");
        }

        sc.close();

    }
}
