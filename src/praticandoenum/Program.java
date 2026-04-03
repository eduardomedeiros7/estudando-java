package praticandoenum;

import poo.enumeracoes.enums.OrderStatus;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TaskStatus currentStatus = TaskStatus.PENDING;
        System.out.println("Current status: " + currentStatus);

         System.out.println("Enter the new status (PENDING, PROCESSING, DONE):");

        try {
            String inputStatus = sc.next().toUpperCase();

            TaskStatus statusNew = TaskStatus.valueOf(inputStatus);


            switch (statusNew){
                case PENDING:
                    System.out.println("The task hasn't started yet");
                    break;
                case PROCESSING:
                    System.out.println("Wait, we are working on it.");
                    break;
                case DONE:
                    System.out.println("Congratulations! Task completed");
            }
        } catch (IllegalArgumentException e){
            System.out.println("Error: Invalid status entered!");
        }finally {
            sc.close();
        }


    }
}
