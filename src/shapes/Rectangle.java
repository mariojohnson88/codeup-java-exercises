package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {

    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}



////    Properties(Variables)
//    protected double length;
//    protected double width;
//
//
////    Constructor
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
////    Method(function)
//    public double getArea() {
//        double area = length * width;
//        return area;
//    }
//
////    Method(function)
//      public double getPerimeter() {
//        double perimeter =  2 * length + 2 * width;
//        return perimeter;
//    }
