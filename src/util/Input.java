package util;

import java.util.Scanner;
public class Input {


//3. Create an input validation class

// Create a package inside of src named util. Inside of util, create a class named Input that has a private property named scanner. When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class. The class should have the following methods, all of which return command line input from the user:

    private Scanner scanner = new Scanner(System.in);

// Will be used later to grab user's input (string) and "equalize" it by making it case insensitive


    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
        //Next used instead of nextline
    }


    // The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {

        int input;
        try {
            input = Integer.valueOf(this.getString("Give me a whole number between " + min + " and "  + max));
        } catch (NumberFormatException e) {
            return getInt(min, max);
        }

        if(input < min || input > max){
            System.out.println(String.format("Sorry. %d is outside of the range, try again/", input));
            return getInt(min, max);
        }
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
        try {
            input = Double.valueOf(this.getString("Give me a decimal between " + min + " and "  + max));
        } catch (NumberFormatException e) {
            return getDouble(min, max);
        }

        if(input < min || input > max){
            System.out.println(String.format("Sorry. %.1f is outside of the range, try again.", input));
            return getDouble(min, max);
        }
        return input;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }

//Create another class named InputTest that has a static main method that uses all the methods from the Input class.

}



