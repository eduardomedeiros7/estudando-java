package exercicios.estruturarepetitivafor;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive number for N:  ");
        int N = sc.nextInt();
        if (N < 0){
            System.out.println("Please enter a positive number:");
            sc.nextInt();
        }
        else{
            for (int i=1; i<=N; i++){

                int first = i;
                int second = i*i;
                int third = i * i * i;
                System.out.printf("%d %d %d\n", first, second,third);


            }
        }
    }
}
