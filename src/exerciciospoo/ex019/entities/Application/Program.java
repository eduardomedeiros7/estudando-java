package exerciciospoo.ex019.entities.Application;

import exerciciospoo.ex019.entities.ImportedProduct;
import exerciciospoo.ex019.entities.Product;
import exerciciospoo.ex019.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        List<Product>list = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Product #" + (i + 1));
            System.out.println("Common, used or imported (c/u/i)?");
            char user = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();
            if (user == 'c'){
              list.add(new Product(name, price));
            }
            else if (user == 'u'){
                System.out.println("Manufacturing date:");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            }
            else{
                System.out.println("Import tax:");
                double customFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customFee));
            }
        }

        System.out.println();
        System.out.println("Price tag");
        for (Product prod : list){
            System.out.println(prod.priceTag());
        }   



        sc.close();
    }
}
