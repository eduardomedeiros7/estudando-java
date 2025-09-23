package exercicios.estruturarepetitivafor;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int N = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < N; i++){
            System.out.println("Enter an integer: ");
            int X = sc.nextInt();
            if (X >= 10 && X <= 20){
                in += +1;
            }
            else{
                out += +1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();


    }
}

