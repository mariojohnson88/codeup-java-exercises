package shapes;

public class Rectangle {

//    Properties(Variables)
    protected double length;
    protected double width;


//    Constructor
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

//    Method(function)
    public double getArea() {
        double area = length * width;
        return area;
    }

//    Method(function)
      public double getPerimeter() {
        double perimeter =  2 * length + 2 * width;
        return perimeter;
    }
}
