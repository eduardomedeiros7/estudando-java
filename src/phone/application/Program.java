package phone.application;

import phone.entities.Phone;
import phone.entities.User;

import java.util.Locale;

public class Program {
    static void main() {
        Locale.setDefault(Locale.getDefault());

        Phone phone1 = new Phone("Phone1", "Black", 2500.0, "HD", 60, 5000, "Ceramic Shield");

        Phone phone2 = new Phone("Phone15", "Blue", 7000.0, "4k", 120, 6000.0, "Ceramic Shield");
        phone2.setIpRating("ip68");


        User user = new User("Carlos", "email@gmail.com", phone1);
        System.out.println("---Phones---");
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(user);

    }
}


