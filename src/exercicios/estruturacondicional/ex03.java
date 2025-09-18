package exercicios.estruturacondicional;


import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int numberA = sc.nextInt();
        int numberB = sc.nextInt();
        if (numberA % numberB == 0 || numberB % numberA == 0){
            System.out.println("They are multiple");
        }else{
            System.out.println("They are not multiples");
        }
        sc.close();
    }
}
