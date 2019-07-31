package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input (){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Type a string, pick anything: ");
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Please decide yes or no: [y/N] ");
        String answer = scanner.next();
        boolean newConfirmation = answer.contains("y");
        if (newConfirmation) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.print("Enter an integer between " + min + " and " + max);
        do {
            double userInput = scanner.nextInt();

            if (userInput < min){
                System.out.println("That's too low ");
            } else if(userInput > max){
                System.out.println("That's too high");
            } else {
                return (int)userInput;
            }
        } while(true);
    }

    public int getInt(){
        System.out.println("Give me any integer: ");
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.print("Enter a number between " + min + " and " + max);
        do {
            double userInput = scanner.nextDouble();

            if (userInput < min){
                System.out.println("That's too low ");
            } else if(userInput > max){
                System.out.println("That's too high");
            } else {
                return (int)userInput;
            }
        } while(true);
    }

    public static double getDouble(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for the area and circumference: ");
        double inputDec = scanner.nextDouble();
        return inputDec;
    }

    public double getDouble() {
        System.out.println("Choose a number that is type double: ");
        return this.scanner.nextDouble();
    }
}
