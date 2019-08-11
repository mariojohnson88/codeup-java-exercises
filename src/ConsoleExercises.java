import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n" ,pi);
//        The ".2" after the modulus tells the CLI how many decimals points should be included in the output


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: --> \"" + userInput + "\" <--");


// You only need to use the scanner class once at the very top of the document.
//        There is no need to use the scanner class again. Like below
//        Scanner threeWords = new Scanner(System.in);
        System.out.print("Enter three words: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);

//        nextLine() called to clear input, without it the code would stop after the next System.out.print
        scanner.nextLine();


//        below remember "%s" is used to call for the String variable. the "%n" just creates a new row underneath your output
        System.out.print("Enter a nice long sentence: ");
        String userSentence = scanner.nextLine();
        System.out.printf("Here is your sentence: %s%n", userSentence);


        System.out.printf("What is the width of the classroom?: ");
        String answer = scanner.nextLine();
        double width = Double.valueOf(answer);
        System.out.println(width);
        System.out.printf("What is the length of the classroom?; ");
        answer = scanner.nextLine();
        double length = Double.valueOf(answer);


        System.out.printf("Area of classroom = %.2f%n", width * length);
        System.out.printf("Parameter of classroom = %.2f%n", 2 * width * 2 * length);
        System.out.printf("volume of classroom = %.2f%n", width * length * 10);
    }
}
