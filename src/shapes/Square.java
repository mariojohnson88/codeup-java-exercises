package shapes;

public class Square extends Rectangle {

//    Property(Variables)
double side;


// Constructor
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

//    Method(function)
    public double getArea() {
        double area = side * side;
        return area;
    }

    //    Method(function)
    public double getPerimeter() {
        double perimeter = 4 * side;
        return perimeter;
    }

}
