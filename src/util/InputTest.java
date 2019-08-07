package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        int test = input.getInt();
        System.out.println(test);
        System.out.println(input.getString("type something"));
        System.out.println(input.yesNo());
        System.out.println();
//        System.out.println(input.getInt(-200,200));
        System.out.println(input.getInt());
        System.out.println(input.getDouble(-200, 200));
        System.out.println(input.getDouble("Enter a double"));
    }
}

