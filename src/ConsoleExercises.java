import java.util.Scanner;

public class ConsoleExercises { //Class Definition
    public static void main(String[] args) { //Main Method

Scanner scanner = new Scanner(System.in); //scanner is variable name

// Curriculum:
// sout + tab = System.out.println();

//        String greeting = "Salutations";
//        String name = "Tracy";
//        String day = "Sunday";
////        includes new line (\n)
//        System.out.printf("Hello there, %s. Nice to see you.\n", name);
////        does include new line so will show up together.
//        System.out.printf("%s, %s!", greeting, name);
//        System.out.printf("%s, %s! Today is %s!", greeting, name, day);
//
//
//        double dv = 9.0192837465;
//        System.out.printf("\nString: %s int: %d, double %f ()floating point), other double %15f.\n", "Hi", 5, dv, dv); // ?


//Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

        double pi = 3.14159;
        System.out.printf("The value of pi is %.2f!\n", pi);

//2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

        System.out.print("Please enter 3 words: ");
        String str0 = scanner.next();
        String str1 = scanner.next();
        String str2 = scanner.next();
        System.out.println(String.format("str0: %s str1: %s str2: %s\n",str0, str1, str2));

// 3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user. Rewrite the above example using the nextLine method.

//        System.out.printf("Enter a sentence: ");
//        String firstWord = scanner.nextLine();
//        System.out.println(firstWord);

// 1. Prompt the user to enter values of length and width of a classroom at Codeup.
// Use the nextLine method to get user input and parse the resulting string to a numeric type.
// Assume that the rooms are perfect rectangles
// Assume that the user will enter valid numeric data for length and width.

//        System.out.printf("Enter length and width of your room: ");
//        double length = scanner.nextDouble();
//        double width = scanner.nextDouble();
//        double area = length*width;
//        double perimeter = (2*length) + (2*width);
//        System.out.println(("The area of the room is: " + area));
//        System.out.println(("The area of the room is: " + perimeter));
//
//


    }
}
