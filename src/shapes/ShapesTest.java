package shapes;

//Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method. Inside the main method,
//create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
//verify that the getPerimeter and getArea methods return 18 and 20, respectively.
//create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
//verify that the getPerimeter and getArea methods return 20 and 25, respectively.
public class ShapesTest {

    /*
        public static void main(String[] args) {
        Rectangle box1 = new Rectangle (5,4);
            System.out.println("Box 1:");
            System.out.println(box1.getArea());
            System.out.println(box1.getPerimeter());

        Rectangle box2 = new Rectangle (5,5);
            System.out.println("Box 2:");
            System.out.println(box2.getArea());
            System.out.println(box2.getPerimeter());

        Square square1 = new Square (5);
            System.out.println("Square 1:");
            System.out.println(square1.getArea());
            System.out.println(square1.getPerimeter());

        Square square2 = new Square (3);
            System.out.println("Square 2:");
            System.out.println(square2.getArea());
            System.out.println(square2.getPerimeter());
        }
     */
    public static void main(String[] args) {

        Measurable myShape = new Square(5);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

        myShape = new Rectangle(2, 3);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
    }
}
