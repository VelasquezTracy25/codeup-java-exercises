package util;

public class InputTest {
//Create another class named InputTest that has a static main method that uses all the methods from the Input class.


    public static void main(String[] args) {
        Input input = new Input();
        do {
            System.out.print("Enter a whole integer number: ");
            String userInput = input.getString();
//            input.getInt(userInput);
        } while( input.yesNo() );
        do {
            input.getDouble(1, 10);
        } while( input.yesNo() );
    }
}

