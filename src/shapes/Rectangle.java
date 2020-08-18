package shapes;

public class Rectangle {
    protected int length;
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
        return length * width;
    }

    public int getPerimeter() {
        return ((2 * length) + (2 * width));
    }

    public static void main(String[] args) {

    }
}
