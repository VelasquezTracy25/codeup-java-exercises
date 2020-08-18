package shapes;

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }
//    In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
        //    perimeter = 4 x side
        //    area = side ^ 2
//    Re-run your ShapesTest class. How can you determine which getArea and getPerimeter methods are being called on each object?

    public int getPerimeter() {
        return 4 * side;
    }

    public int getArea() {
        return side * side;
    }
}
