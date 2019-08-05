package shapes;

public class Square extends Quadrilateral {

    public Square(double side){
        super(side, side);

    }
    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {

    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return this.width * this.width;
    }
}



////    Property(Variables)
//double side;
//
//
//// Constructor
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
////    Method(function)
//    public double getArea() {
//        double area = side * side;
//        return area;
//    }
//
//    //    Method(function)
//    public double getPerimeter() {
//        double perimeter = 4 * side;
//        return perimeter;
//    }

