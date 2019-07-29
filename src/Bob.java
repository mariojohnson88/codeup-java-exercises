import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bob is being lazy per usual...");

        do {
            String message = scan.nextLine();

            if (message.endsWith("?")) {
                System.out.println("Sure.");
            } else if (message.endsWith("!")) {
                System.out.println("Whoa chill out!");
            } else if (message.isEmpty()) {
                System.out.println("Fine, be that way!");
            } else if (message.equalsIgnoreCase("Bye") || message.equalsIgnoreCase("Bye.")) {
                System.out.println("Bob continues to stare blankly into his cell phone.");
                break;
            } else {
                System.out.println("Whatever.");
            }
        } while (true);
    }
}
