package Grades;
import util.Input;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

//    Put Hashmap in class so it falls in the entire scope and can be used everywhere here. Putting it only in the method will keep it in the scope of the method.
       static HashMap<String, Student> students = new HashMap<>();
       static Input input = new Input();

    public static void main(String[] args) {

        Student peter = new Student("Peter");
        students.put("OhPeterHollman", peter);
        peter.addGrade(84);
        peter.addGrade(67);
        peter.addGrade(100);
        peter.addGrade(80);
        System.out.println(students.get("OhPeterHollman").getName());
        System.out.println(peter.getGradeAverage());

        Student mario = new Student("Mario");
        students.put("SuperMario", mario);
        mario.addGrade(78);
        mario.addGrade(81);
        mario.addGrade(90);
        mario.addGrade(70);
        System.out.println(students.get("SuperMario").getName());
        System.out.println(mario.getGradeAverage());

        Student victor = new Student("Victor");
        students.put("VictorPena92", victor);
        victor.addGrade(80);
        victor.addGrade(68);
        victor.addGrade(94);
        victor.addGrade(74);
        System.out.println(students.get("VictorPena92").getName());
        System.out.println(victor.getGradeAverage());

        Student susan = new Student("Susan");
        students.put("MommaLin", susan);
        susan.addGrade(89);
        susan.addGrade(93);
        susan.addGrade(72);
        susan.addGrade(82);
        System.out.println(students.get("MommaLin").getName());
        System.out.println(susan.getGradeAverage());
        System.out.println();




//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Here are the GitHub usernames of our students:");
//        System.out.println(students.keySet());
//        System.out.println("What student would you like information on? When you are done, type \"finished.\"");

//        boolean keepGoing = true;
//        do {
//            String userInput = scanner.nextLine();
//            if( userInput.equalsIgnoreCase("OhPeterHollman")){
//                System.out.println("Name: " + peter.getName() + " Average grade: " + peter.getGradeAverage());
//            } else if(userInput.equalsIgnoreCase("MommaLin")){
//                System.out.println("Name: " + susan.getName() + " Average grade: " + susan.getGradeAverage());
//            } else if(userInput.equalsIgnoreCase("SuperMario")){
//                System.out.println("Name: " + mario.getName() + " Average grade: " + mario.getGradeAverage());
//            } else if (userInput.equalsIgnoreCase("VictorPena92")) {
//                System.out.println("Name: " + victor.getName() + " Average grade: " + victor.getGradeAverage());
//            } else if (userInput.equalsIgnoreCase("Finished")){
//                keepGoing = false;
//            }else {
//                System.out.println("Sorry, no student found with the GITHub username of " + userInput);
//                String UserInput = scanner.nextLine();
//            }
//        } while(keepGoing);





//        the Fer way
        System.out.println("Welcome!\n");

        showStudents();

        boolean cont = true;

        do{

            String key = input.getString("What student would you like to see more information on?");

            if(students.containsKey(key)){
                System.out.println("Name: "+ students.get(key).getName() +" - GitHub Username: " + key );
                System.out.println("Current Average: " + students.get(key).getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + key);
            }

            cont = input.yesNo("Would you like to see another student?");

        }while(cont);

        System.out.println("Goodbye, and have a wonderful day!\n");

    }


    public static void showStudents(){
        System.out.println("Here are the GitHub usernames of our students:");
        for( String username: students.keySet()) {
            System.out.print(username + " | ");
        }
        System.out.println();
    }
}
