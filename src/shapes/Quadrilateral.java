package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
//    Protected Properties
    protected double length;
    protected double width;


//    Constructor
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

//    methods to get length and width (getters)
    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }


//    abstract methods for setting length and width (setters). You must implement these methods if you want to be a quadrilateral
    public abstract void setLength();

    public abstract void setWidth();
}
