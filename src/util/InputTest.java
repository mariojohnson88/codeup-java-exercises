package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        int test = input.getInt("Enter an integer");
        System.out.println(test);
        System.out.println(input.getString());
        System.out.println(input.yesNo());
        System.out.println(input.getInt(-200,200));
//        System.out.println(input.getInt());
        System.out.println(input.getDouble(3985, 49852));
        System.out.println(input.getDouble("Enter a double"));
    }
}

