import java.sql.SQLOutput;
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
            System.out.println(i++);
        }

//Do While
        i = 0;
        do {
            System.out.println(i);
            i += 2;
        } while (i <= 100);


        i = 100;
        do {
            System.out.println(i);
            i -= 5;
        } while (i >= -10);

       long n = 2;
        do {
            System.out.println(n);
            n *= n;
        } while(n < 1000000);

// We have to call the fizzbuzz method inside the main method. Since it sits outside of it.
        fizzBuzz(100);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        int userInput = scanner.nextInt();
        System.out.println("you entered: " + userInput);



    }
}
