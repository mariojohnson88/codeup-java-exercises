import java.util.Scanner;
public class ControlFlowExercises {
        static void fizzBuzz(int num) {
            for (int i = 1; i <= num; i++) {
                if (i % 15 == 0) {
                    System.out.println("fizzbuzz");
                } else if (i%5==0) {
                    System.out.println("buzz");
                } else if (i%3==0) {
                    System.out.println("fizz");
                } else {
                    System.out.println(i);
                }
            }
        }
    public static void main(String[] args) {

//While
        int i = 5;
        while (i <= 15) {
            System.out.print(i);
            System.out.print(" ");
            i++;
        }

//Do While
        int j = 0;
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

//        refactored while loop
        for (int m = 5; m <= 15; m++){
            System.out.print(m);
            System.out.print(" ");
        }
// We have to call the fizzbuzz method inside the main method. Since it sits outside of it.
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
    }
}
