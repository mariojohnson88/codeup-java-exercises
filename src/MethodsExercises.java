import java.util.Scanner;

//    visibility ownership ReturnType medthodName(ParamType paramName,...) {
//    return something if the ReturnType is something other than void
//        }


//1.
public class MethodsExercises {
    public static double addition(double a, double b){
        return a + b;
    }
    public static double subtraction(double c, double d){
        return c - d;
    }

//    BONUS a multiplication method using a loop with recursion w/o *
    public static double multiplication (double e, double f){
//        return e * f;
       double result = 0;
       for(int i = 0; i < f; i++){
           result += e;
       }
       return result;
    }
    public static double division (double g, double h){
        return g / h;
    }
    public static double modulus (double i, double j){
        return i % j;
    }

   public static void randomIntegers() {
        double randomDouble = Math.random();
        randomDouble = randomDouble * 12 + 1;
        int randomInt = (int) randomDouble;
        System.out.println(randomInt);
    }


//2.
    public static int getInteger(double min, double max) {

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



//        Recursive version
//        answer + scanner.next(System.in);
//        if (answer < min || answer > max) return getInteger(1,10);
    }
    public static void main(String[] args) {
        System.out.println(addition(4,9));
        System.out.println(subtraction(10,5));
        System.out.println(multiplication(9,4));
        System.out.println(division(20,5));
        System.out.println(modulus(100,25));


        long factorial = getInteger(1,10);
        long helpfulInt = factorial;
        for(long i = 1; i < helpfulInt; i++){
            factorial *= i;


        }
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Would you like to continue and see the factorial of this number? [y/N] ");
        String willTheyContinue = scanner2.next();
        boolean newConfirmation = willTheyContinue.equalsIgnoreCase("y");
        if(newConfirmation){
            System.out.println("The Factorial of " + helpfulInt + " is " + factorial);

//            Scanner scanner3 = new Scanner(System.in);
            System.out.println("How about trying your luck, wanna roll the dice?: [y/N] ");
            String diceQuestion = scanner2.next();
            boolean diceConformation = diceQuestion.equalsIgnoreCase("y");
            if (diceConformation) {
                System.out.println("First off. How many sides are on a pair if dice? ");

                do {
                    int howManySides = scanner2.nextInt();
                    int sides = 12;
                    if (howManySides < sides) {
                        System.out.println("Wow that's way too low ");
                    } else if (howManySides > sides) {
                        System.out.println("Okay, come on now. WAY too many!");
                    } else if (howManySides == sides) {
                        System.out.println("Nice! You might out as well roll the dice. \"DO IIITTT\" -Shia Labouf: [y/N]");
                        String rollDice = scanner2.next();
                        boolean newestConfirmation = rollDice.equalsIgnoreCase("y");
                        if(newestConfirmation){
                            System.out.print("You rolled a: ");
//                            PUt random number generator here
                                randomIntegers();
                        }
                    }
                } while (true);
            }
        }
    }
}

