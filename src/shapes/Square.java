package shapes;

public class Square extends Quadrilateral {
    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.setLength(width);
    }

    @Override
    public double getPerimeter() {
        System.out.println("Square Perimeter:");
        return 4 * this.length;
    }
    @Override
    public double getArea() {
        System.out.println("Square Area:");
        return this.length * this.length;
    }
/*


    // Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
//    public Square(int side) {
//        super(side, side);
//    }

//    In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
        //    perimeter = 4 x side
        //    area = side ^ 2
//    Re-run your ShapesTest class. How can you determine which getArea and getPerimeter methods are being called on each object?

//Use this.length instead of super.length to reduce likelihood of human error:

    @Override
    public int getPerimeter() {
        System.out.println("Square Perimeter:");
        return 4 * this.length;
    }
    @Override
    public int getArea() {
        System.out.println("Square Area:");
        return this.length * this.length;
    }
*/

}
