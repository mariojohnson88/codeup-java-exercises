package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double radius = input.getDouble("What is the radius of this circle");
        Circle ourFunCircle = new Circle(radius);
        System.out.printf("Area of circle = %f%n", ourFunCircle.getArea());
        System.out.printf("Circumference of circle = %f%n", ourFunCircle.getCircumference());
    }
}



