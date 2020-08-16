import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

    //call table of powers
    tableOfPowers();
/*
While

Create an integer variable i with a value of 5.
Create a while loop that runs so long as i is less than or equal to 15
Each loop iteration, output the current value of i, then increment i by one.
Your output should look like this:

5 6 7 8 9 10 11 12 13 14 15
 */

        System.out.println("While number is greater than 5 and less than / equal to 15, print number.");
        int j = 5;
        while (j <= 15) {
            System.out.println("Count is: " + j);
            j++;
        }


/*
A. Do While

Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
*/

        System.out.println("Start and 2 and count to 100 by 2.");

        int a = 2;

        do {
            System.out.println("Count is: " + a);
            a += 2;
        }
        while (a <= 100);

//Alter your loop to count backwards by 5's from 100 to -10.

        System.out.println("Start 100 and count to 0 by 5s.");

        int b = 100;

        do {
            System.out.println("Count is: " + b);
            b -= 5;
        }
        while (b >= 0);


//Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

        System.out.println("Let's use a do while loop.");
        long k = 2;
        do {
            System.out.println(k);
            k *= k;
        } while (k < 1000000);

// C. For
// Refactor the previous two exercises to use a for loop instead.

        System.out.println("Let's use a for loop.");
        for (long i = 2L; i < 1000000; i *= i) {
            System.out.println(i);
        }

// 2. Fizzbuzz
//One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.

        for (int i = 1; i < 100; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }

        randomNumber();
    }

    public static void randomNumber() {
        int randomNumber = (int) (Math.random() * 100);
        if (randomNumber % 15 == 0)
            System.out.println("The random number is " + randomNumber + " and is divisible by 3 AND 5. FIZZBUZZ.");
        else if (randomNumber % 3 == 0)
            System.out.println("The random number is " + randomNumber + " and is divisible by 3. Very Fizzy.");
        else if (randomNumber % 5 == 0)
            System.out.println("The random number is " + randomNumber + " and is divisible by 5. Very Buzzy");
        else
            System.out.println("The random number is " + randomNumber + " and is neither Fizzy nor Buzzy.");
    }

//3. Display a table of powers.
//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output

public static void tableOfPowers(){

    {
        Scanner scanner = new Scanner(System.in);
        String userResponse;
        do {
            System.out.print("Enter an integer here:");
            int userInteger = scanner.nextInt();
            System.out.println("Here is your table!\n" +
                    "number | squared | cubed\n" +
                    "------ | ------- | -----");
            for (int i = 1; i <= userInteger; i++) {
                int squared = (int) Math.pow(i, 2);
                int cubed = (int) Math.pow(i, 3);
                System.out.printf("%-6d | %-7d | %-5d%n", i, squared, cubed);
            }
            System.out.printf("\n\nWould you like to continue (y/n): ");
            userResponse = scanner.next();
        } while (userResponse.equals("y"));

    }

}
}

