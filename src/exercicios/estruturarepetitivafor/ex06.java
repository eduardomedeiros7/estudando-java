package exercicios.estruturarepetitivafor;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N: ");
        int N = sc.nextInt();

        for (int i = 1; i<= N; i++){
            if (N % i == 0){
                System.out.println(i);
            }


        }
        sc.close();
    }


    }

