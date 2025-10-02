package exerciciospoo.ex003;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Student student = new Student();
        student.gradeA = sc.nextDouble();
        student.gradeB = sc.nextDouble();
        student.gradeC = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f\n", student.finalGrade());
        if (student.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n",student.missingPoints());
        }
        else{
            System.out.println("PASS");
        }
        sc.close();

    }
}
