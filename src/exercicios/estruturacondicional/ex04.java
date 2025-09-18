package exercicios.estruturacondicional;


import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Game start time:");
        int timeStart = sc.nextInt();
        System.out.println("Game final time:");
        int timeEnd = sc.nextInt();

        int duration;
        if (timeStart < timeEnd){
            duration = timeStart - timeEnd;
        }else{
            duration = 24 - timeStart + timeEnd;
        }
        System.out.println("Game duration " + duration + " hours");


        sc.close();
    }
}
