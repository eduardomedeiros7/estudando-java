package aprendendojava.estruturasrepetitivas.facaenquanto;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char choiceCpu = 'B';
        char userChoice;

        do {
            System.out.println("Guess the secret letter: ");
            userChoice = sc.next().toUpperCase().charAt(0);
            if (userChoice != choiceCpu){
                System.out.println("Try again...");
            }
        }while (userChoice != choiceCpu);
        System.out.println("Congratulations!");
        sc.close();
    }
}
