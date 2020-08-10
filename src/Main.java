public class Main { //Class definition
    public static void main(String[] args) { //Main Method
        System.out.println("Hello, World!"); //System Output



// 1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.

        int myFavoriteNumber = 25;
        System.out.println(myFavoriteNumber);

// 2. Create a String variable named myString and assign a string value to it, then print the variable out to the console.

        // String myString = "This is my string.";
        // System.out.println(myString);

// 3. Change your code to assign a character value to myString. What do you notice?

        // char myString = "This is my string.";
        // System.out.println(myString);

//outputs error: "string cannot be converted to char"

// 4.Change your code to assign the value 3.14159 to myString. What happens?

        // char myString = 3.14159;
        // System.out.println(myString);

//outputs error: "possible lossy conversion from double to char"


// 5. Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?

        // long myNumber;
        // System.out.println(myNumber);
        //error: "variable may not have been initialized"


//6. Change your code to assign the value 3.14 to myNumber. What do you notice?

        // long myNumber = 3.14;
        // System.out.println(myNumber);

//outputs error: "possible lossy conversion from double to long"

//7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

        // long myNumber = 123L;
        // System.out.println(myNumber);

//8.Change your code to assign the value 123 to myNumber.

        // long myNumber = 123;
        // System.out.println(myNumber);

//9. Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?

// 3.14 has a decimal in it (should be float)

//10. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

        float myNumber = (float) 3.14;
        System.out.println(myNumber);

        /* Copy and paste the following code blocks one at a time and execute them

         */
        System.out.println("int x");
        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        System.out.println("int y");
        int y = 5;
        System.out.println(++x);
        System.out.println(x);

/*
What is the difference between the above code blocks? Explain why the code outputs what it does.

*/

// 11. Try to create a variable named class. What happens?

    // Object class = 5;
    // System.out.println(class);
//many errors: illegal start, identifier issue, not a statement

// 12.Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?



    // String theNumberThree = "three";
    // Object o = theNumberThree;
    // int three = (int) o;

//huge error

/*
Copy and paste the code above and then run it. Does the result match with your expectation?

How is the above example different from the code block below?
*/

// int three = (int) "three";

// What are the two different types of errors we are observing?

// string cannot be converted to int

// 13. Rewrite the following expressions using the relevant shorthand assignment operators:

/*
int x = 4;
x = x + 5;
*/

    int k = 4;
    k += 5;
    System.out.println(k);

/*
int x = 3;
int y = 4;
y = y * x;
*/

// x = 3;
// y = 4;
// y *= x;
// System.out.println(y);

/*
int x = 10;
int y = 2;
x = x / y;
y = y - x;
*/

    x = 10;
    y = 2;
    x /= y;
    y -= x;

    System.out.println(x);
    System.out.println(y);


// 14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?

    int coolExample = Integer.MAX_VALUE + 1;
    System.out.println(coolExample);

//Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

    }
    }
