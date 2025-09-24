package aprendendojava.estruturasrepetitivas.facaenquanto;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int passWord = 1234;
        int userPassword;

        do {
            System.out.println("Enter the 4-digit password: ");
            userPassword = sc.nextInt();

            if (userPassword != passWord){
                System.out.println("Incorrect password. Try again.");
            }

        }while (userPassword != passWord);
        System.out.println("Access allowed!");
        sc.close();


    }



    }

