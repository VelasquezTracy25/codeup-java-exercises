package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;

    }

    @Override
    public void setWidth(double width) {
        this.width = width;

    }

    @Override
    public double getPerimeter() {
    System.out.println("Rectangle Perimeter:");
        return ((2 * length) + (2 * width));

    }

    @Override
    public double getArea() {
        System.out.println("Rectangle Area:");
        return length * width;
    }
}
  /*  protected int length;
    protected int width;

    //    constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //setters and getters
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // to formulas for area and perimeter
    public int getArea() {
        System.out.println("Rectangle Area:");
        return length * width;
    }

    public int getPerimeter() {
        System.out.println("Rectangle Perimeter:");
        return ((2 * length) + (2 * width));
    }

    public static void main(String[] args) {
    }
    */
