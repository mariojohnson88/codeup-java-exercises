package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input (){
        this.scanner = new Scanner(System.in);
    }
    public String getString(){
//        System.out.println("Type a string, pick anything: ");
        return this.scanner.nextLine();
    }

    public String getString(String prompt){
//        System.out.println("Type a string, pick anything: ");
        System.out.println(prompt);
        return this.getString();
    }

    public boolean yesNo(){
        System.out.println("Please decide yes or no: [y/N] ");
        String answer = scanner.nextLine();
        if (answer.contains("y")) {
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
        int userInput;
        try {
            do {
                System.out.print("Enter an integer between " + min + " and " + max);

//            int userInput = scanner.nextInt();

                userInput = Integer.valueOf(getString());
                if (userInput < min) {
                    System.out.println("That's too low ");
                } else if (userInput > max) {
                    System.out.println("That's too high");
                } else {
                    return userInput;
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("You entered an incorrect type, please try again.");
            return getInt(min, max);
        }
    }

    public int getInt() {
//        System.out.println("Give me any integer: ");
        System.out.println("please enter an integer.\n");

        int input;
        try {
            input = Integer.valueOf(getString());
            return input;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Wrong input. Please try again.");
            return getInt();
        }
    }

    public double getDouble(double min, double max) {

        double input;
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
//        return this.getDouble();
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number for the area and circumference: ");
        double inputDec = scanner.nextDouble();
        return inputDec;
    }

    public double getDouble() {
        System.out.println("Choose a number that is type double: ");
        return this.scanner.nextDouble();
    }
}
