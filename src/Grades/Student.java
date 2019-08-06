package Grades;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;


//    Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }


//     Methods

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        for(int i = 0; i < grades.size(); i++){
            total += grades.get(i);
        }
        return total / this.grades.size();
    }


//    OR

//    public double getGradeAverage(){
//        int sum = 0;
//        for(int grade : this.grades){
//            sum += grade;
//        }
//        return sum / this.grades.size();
//    }
//


// Main method
    public static void main(String[] args){
        Student susan = new Student("Susan");
        System.out.println(susan.getName());
        susan.addGrade(50);
        susan.addGrade(90);
        System.out.println(susan.grades);
        System.out.println(susan.getGradeAverage());
    }


}
