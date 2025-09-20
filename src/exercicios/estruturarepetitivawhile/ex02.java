package exercicios.estruturarepetitivawhile;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the X end Y coordinates:");
        int coordinatesX = sc.nextInt();
        int coordinatesY = sc.nextInt();

        while (coordinatesX != 0 && coordinatesY != 0) {
            if (coordinatesX > 0 && coordinatesY > 00) {
                System.out.println("First quadrant");
            } else if (coordinatesX < 0 && coordinatesY > 0) {
                System.out.println("Second quadrant");
            } else if (coordinatesX < 0 && coordinatesY < 0) {
                System.out.println("Third quadrant");
            } else if (coordinatesX > 0 && coordinatesY < 0) {
                System.out.println("Fourth quadrant");
            }
            System.out.println("Enter the X end Y coordinates:");
             coordinatesX = sc.nextInt();
             coordinatesY = sc.nextInt();
        }
        System.out.println("Program finished,");
        sc.close();

    }
}


