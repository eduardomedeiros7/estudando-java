package exerciciospoo.ex003;

public class Student {
    String name;
    double gradeA;
    double gradeB;
    double gradeC;

    public  double finalGrade(){
        return gradeA + gradeB + gradeC;
    }
    public double missingPoints(){
        if (finalGrade() < 60.0){
            return 60.0 - finalGrade();
        }
        else{
            return 0.0;
        }
    }

}
