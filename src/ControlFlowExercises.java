import java.util.Scanner;

public class ControlFlowExercises {

        static void fizzBuzz(int num) {
            for (int i = 1; i <= num; i++) {
                if (i % 15 == 0) {
                    System.out.println("fizzbuzz");
                } else if (i % 5 == 0) {
                    System.out.println("buzz");
                } else if (i % 3 == 0) {
                    System.out.println("fizz");
                } else {
                    System.out.println(i);
                }
            }
        }

    private static void letterGrade() {
        Scanner scanner = new Scanner(System.in);
        String gradeAnswer;

        do {
            System.out.print("Please enter the students numerical grade: ");
            double studentGrade = scanner.nextDouble();
            System.out.print(studentGrade);
            System.out.println(" ");

            if(studentGrade <= 100 && studentGrade >= 88){
                System.out.println("This student has an A!");
            } else if(studentGrade <= 87 && studentGrade >= 80){
                System.out.println("This student has a B!");
            } else if(studentGrade <= 79 && studentGrade >= 67){
                System.out.println("This student has a C.");
            } else if(studentGrade <= 66 && studentGrade >= 60){
                System.out.println("This student has a D, might be time to call a parent.");
            } else if(studentGrade <= 59 && studentGrade >= 0){
                System.out.println("This student has an F, time to redo Codeup.");
            } else System.out.println();
                System.out.println("Would you like to enter another grade? (y/n)");
                gradeAnswer = scanner.next();
        } while(gradeAnswer.equalsIgnoreCase("y"));
    }

    public static void main(String[] args) {

//While
        int i = 5;
        while (i <= 15) {
            System.out.print(i);
//          The SOUT below adds a space between each character iteration
            System.out.print(" ");
            i++;
        }

//Do While
//The SOUT before the Do While loop below allows this iteration to start below the while loop. Other wise it will start on the end of the while iteration.
        System.out.println();
        int j = 2;
        do {
            System.out.println(j);
            j += 2;
        } while (j <= 100);


        int k = 100;
        do {
            System.out.println(k);
            k -= 5;
        } while (k >= -10);


       long l = 2;
        do {
            System.out.println(l);
            l *= l;
        } while(l < 1000000);

//Refactored while loops into For loops
        for (int m = 5; m <= 15; m++){
            System.out.print(m);
            System.out.print(" ");
        }

        for (int n = 5; n <= 15; n++){
            System.out.print(n);
            System.out.print(" ");
        }

//        Again the SOUT below is to create a new line between iterations
        System.out.println();
        for (int o = 2; o <= 100; o++){
            System.out.println(o);
        }

//// We have to call the fizzbuzz method inside the main method. Since it sits outside of it.
        fizzBuzz(100);
        squaresCubes();
        }
        private static void squaresCubes(){
            Scanner scan = new Scanner(System.in);
            String answer;

            do {
                System.out.println("What number would you like to go up to? ");
                int userNum = scan.nextInt();
                System.out.println();

                System.out.println("Here is your table!");
                System.out.println();

                System.out.println("number | squared | cubed");
                System.out.println("------ | ------- | -----");
                for (long i = 1; i <= userNum; i++) {
                    System.out.printf("%-7d|%-9d|%-8d%n", i, i * i, i * i * i);
                }
                System.out.println();
                System.out.println("Do you want to continue (y/n)? ");
                answer = scan.next();
            } while (answer.equalsIgnoreCase("y"));

            System.out.println("Thank you for playing!");

        letterGrade();
    }
}
