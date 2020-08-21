package practice;

import java.awt.*;
import java.util.Arrays;
import java.util.Date; //auto imported to use "Date" class

public class JavaPractice {

    public static void main(String[] args) {
        //public method - accessible from other parts of this program -  ***main should always be static
        //static -
        //void - will not return anything
        //parameters
        System.out.println(); // prints line
        System.out.print("hey girl \n");

        System.out.println("This code is platform independent. JVN takes byte code from class and turns it into native code for whatever underlying native machine needs to run it. ");

        System.out.println("------------");
        //storing age in database
        //we are initizialing this variable here on line 18.
        // Specify type, give name, assignment operator (=) and variable.
        byte age = 30, temp = 20; //<-- not recommened, declare each var on one line
        byte herAge = age; //if code is run with this on line 19, age will be 30. If code is run with this afet age =35, herAge will be 35.

        age = 35; //change the value of the variable
//        int herAge = age;

        System.out.println(age);
        System.out.println(herAge);

//        long is used for large number

//Primitive Types:
        long viewsCount = 3_123_456_789L; //L is used to declare large number
        float price = 10.99F; // //F to indicate float
        char letter = 'A';
        String stringy = "this is a string";
        boolean isEligible = false;

        System.out.println(isEligible);

//Reference Types (used for storing more complex data like email messages, dates, etc...)
        //primitive:
        byte PrimitiveAge = 30;
        //reference:
        Date now = new Date();
        //"new" allocates memory for new variable. Only needed when declaring reference types (not primitive)
        //"Date()" is an object, and instance of the Date class
        now.getTime(); //"." is dot operator
        System.out.println(now); // passed date object "now" and prints "Sat Aug 15 20:13 CDT 2020"

//        byte x = 1;
//        byte y = 1;
//        x = 2;
//        System.out.println(x); // changes to 2
//        System.out.println(y);// y is not affected because x and y are independent of each other

//
        System.out.println("Point 1");
        Point point1 = new Point(1, 1); //has address of "100 10th street"
        System.out.println(point1);
//
        Point point2 = point1; //because this is a refernce type, it doesnt actually take up the space at the address, it just points to "100 10th street"
        System.out.println("Point 2");
        System.out.println(point2);

//
        point1.x = 2; //because point1 and point2 point to the same address, they will both change
        //^^ this change point 1(x) to 2 and keeps

        System.out.println("Point 1");
        System.out.println(point2);

//Strings
        String message = "    Hello World" + "!!"; // shorthand way of initiliazing String message = new String "Hello World";
        System.out.println(message);
        System.out.println(message.endsWith("!!")); //returns true
        System.out.println(message.startsWith("!!")); //returns false
        System.out.println(message.length()); //returns 13
        System.out.println(message.indexOf("e")); // returns 1 (e is the second letter of "Hello World!!")
        System.out.println(message.indexOf("sky")); //returns -1 because it does not exist
        System.out.println(message.replace("!", "*")); //returns "Hello World**"
        // ^^ "Hello World!!" is not modified, a new string ("Hello World**" is returned
        System.out.println(message); //returns "Hello World" because Java strings are immutable
        System.out.println(message.toLowerCase()); //returns hello world!!
        System.out.println(message.toUpperCase()); //reurns HELLO WORLD!!
        System.out.println(message.trim()); //removes white spac. If "    Hello World !!" is entered will return "Hello World!!"

        //parameters = target and replacement
        //arguments "!" and "*"

//Arrays
        //before:
        //int number = 1;

        int[] numbers = new int[5];
        //int: "its going to be a list of numbers"
        //[]: "its going to be an array
        //numbers: plural because mulitple numbers
        //new: new operator "new array" used because arrays are reference types
        //int: number of elements/items in the array (5) i.e. size/length of the array

        //setting values to the indexes in the array
        //older syntax:
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 3;
        //"0" will be printed out if no value is assigned

        System.out.println(numbers); //prints [I@4439f31e because its hsowing the memory location or something
        //use this to access info inside array
        System.out.println(Arrays.toString(numbers));

        int[] numbersNEW = {4, 5, 1, 3, 2, 6,};
        System.out.println(Arrays.toString(numbersNEW)); //[4, 5, 1, 3, 2, 6]
        System.out.println(numbers.length); //throws back length
        Arrays.sort(numbersNEW); // sorts in order
        System.out.println(Arrays.toString(numbersNEW));//prints sorted in order [1, 2, 3, 4, 5, 6]

//MultiDimensional arrays

//2D Arrays (Matrix)

        int [][] numbersMatrix = new int[2][3];
        //first [][] tells it that it will be rows x columns x length
        //[2] 2 rows;
        //[3] 3 columns;

        numbersMatrix [0][0] = 1; //index of row
        System.out.println(numbersMatrix); //will just print [[I@23ceabc1
        System.out.println(Arrays.deepToString(numbersMatrix)); //prints [[1, 0, 0], [0, 0, 0]]

        int matrixExample [][] = {{1,2,3}, {4,5,6},{7,8,9}};
        System.out.println(matrixExample); //prints [[I@5d5eef3d
        System.out.println(Arrays.deepToString(matrixExample)); //prints[[1, 2, 3], [4, 5, 6], [7, 8, 9]]


//Const

        final float pi = 3.14F; //Java compiler sees this as a decimal by defaultso we need to add F for float
        //adding final (const), we cannot change it
        //pi = 1; //this will not run

//Arithmetic Expressions

        int result = 10 + 3;
        int division = 10 / 3;

        System.out.println("10/3=" + division); //returns 10/3 = 3 because it is not factoring in the remainder
        double division2 = (double) 10/ (double)3;
        System.out.println(division2); //returns 3.3333333333

//Increment and decrement

        int a = 1;
        int b = a++;
        System.out.println("a and b");
        System.out.println(a); //returns 2
        System.out.println(b); //returns 1

        int c = 1;
        int d = ++c;
        System.out.println("c and d");
        System.out.println(c); //returns 2
        System.out.println(d); //returns 2

        int x = 1;
        int y = x--;
        System.out.println("x and y");
        System.out.println(x); //returns 0
        System.out.println(y); //returns 1

        int t = 1;
        int v = --t;
        System.out.println("t and v");
        System.out.println(t); //returns 0
        System.out.println(v); //returns 0


//Casting

        //Example of implicit casting (automatic casting):
        //byte > short > int > long
        short xx = 1;
        int yy = xx +2;

        System.out.println(yy); //returns 3
        //In this example, we're adding a short (x) to an int (2). Java can take bytes from a short variable (2 bytes) and add to an int (4 bytes) because short is smaller than int. This makes them equal.


        //explicit casting
        //byte > short > int > long
        String ttt = "1";
        Integer.parseInt(ttt); //changes string to number/int
        double yyy = Integer.parseInt(ttt) + 2;
        System.out.println(yyy); //returns 3.0

        //using double to return parsed string with decimal
        String zzz = "1.1";
        Integer.parseInt(ttt); //changes string to number/int
        double hhh = Double.parseDouble(zzz) + 2;
        System.out.println(hhh); //returns 3.1

    }

}
