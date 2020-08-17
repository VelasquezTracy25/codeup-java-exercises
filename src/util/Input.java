package util;

import java.util.Scanner;

public class Input {


//3. Create an input validation class

// Create a package inside of src named util. Inside of util, create a class named Input that has a private property named scanner. When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class. The class should have the following methods, all of which return command line input from the user:

    private Scanner scanner = new Scanner(System.in);

// Will be used later to grab user's input (string) and "equalize" it by making it case insensitive


    public String getString() {
        return scanner.next().toLowerCase();
        //Next used instead of nextline
    }


// The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
    public boolean yesNo() {
        System.out.print("Would you like to play a game? ");
        String input = getString();
        if (input.equals("y") || input.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        int input;
        do {
//            System.out.print();
            input = getInt(); // calls itself again to loop until user guess right
        } while (input < min || input > max);
        return input;
    }

//    // Overloading above method
//    // Get the user's input with the option String parameter "prompt"
//    public int getInt(String prompt) {
//        System.out.println(prompt);
//        int input = Integer.parseInt(prompt);
//        return input;
//    }

//The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.

//Used to grab user's input (int(s) only)
    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double input;
        do {
            System.out.print("Please enter in a double value: ");
            input = getDouble(); //loop again
        } while (input < min || input > max);
        return input;
    }
    public double getDouble() {

        return scanner.nextDouble();
    }

//Create another class named InputTest that has a static main method that uses all the methods from the Input class.
}



