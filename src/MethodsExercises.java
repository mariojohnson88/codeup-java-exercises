import java.util.Scanner;

public class MethodsExercises {
    public static double addition(int a, int b){
        return a + b;
    }
    public static double subtraction(int c, int d){
        return c - d;
    }
    public static double multiplication (int e, int f){
        return e * f;
    }
    public static double division (int g, int h){
        return g / h;
    }
    public static int modulus (int i, int j){
        return i % j;
    }
    public static int getInteger(int min, int max) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max);

        do {
            int userInput = scanner.nextInt();

            if (userInput < min){
                System.out.println("That's too low ");
            } else if(userInput > max){
                System.out.println("That's too high");
            } else {
                return userInput;
            }
        } while(true);
    }
    public static void main(String[] args) {
        System.out.println(addition(4,9));
        System.out.println(subtraction(10,5));
        System.out.println(multiplication(9,4));
        System.out.println(division(20,5));
        System.out.println(modulus(100,25));
        getInteger(1, 10);
    }
}

