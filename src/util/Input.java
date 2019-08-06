package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input (){
        this.scanner = new Scanner(System.in);
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        String answer = scanner.next();
        boolean newConfirmation = answer.contains("y");
        if (newConfirmation) {
            return true;
        } else {
            return false;
        }
    }
    public boolean yesNo(String prompt){
        System.out.println(prompt);
        return this.yesNo();
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

    public int getInt(String prompt){
        System.out.println(prompt);
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

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return this.getDouble();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number for the area and circumference: ");
//        double inputDec = scanner.nextDouble();
//        return inputDec;
    }

    public double getDouble() {
//        System.out.println("Choose a number that is type double: ");
        return this.scanner.nextDouble();
    }
}
