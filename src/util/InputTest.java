package util;

public class InputTest {
//Create another class named InputTest that has a static main method that uses all the methods from the Input class.

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("input.getInt(1,5) = " + input.getInt(1,5));

        System.out.println("input.getInt() = " + input.getInt());

        System.out.println("input.getDouble() = " + input.getDouble());
        System.out.println("input.getDouble(min, max) = " + input.getDouble(5.5, 10.90));
    }
}

