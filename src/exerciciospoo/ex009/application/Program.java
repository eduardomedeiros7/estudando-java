package exerciciospoo.ex009.application;

import exerciciospoo.ex009.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Rent[] rents = new Rent[10];

        System.out.println("How many rooms will be allocated?");
        int numberStudents = sc.nextInt();


        for (int i = 0; i < numberStudents; i++ ){
            sc.nextLine();
            System.out.println("Rent #" + (i+1));
            System.out.println("Name:");
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.next();
            System.out.println("Room: ");
            int room = sc.nextInt();
            rents[room]  = new Rent(name, email, room);
        }
        System.out.println("Busy rooms: ");
        for (int i = 0; i< rents.length; i++){
            if (rents[i]!= null){
                System.out.println(rents[i]);
            }

        }


        sc.close();

    }
}
