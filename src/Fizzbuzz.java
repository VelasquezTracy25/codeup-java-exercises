public class Fizzbuzz {
    public static void main(String[] args) {
//Create a class named FizzBuzz, and write a fizzBuzz method that will loop to the number passed and complete the FizzBuzz problem.
        fizzBuzz(50);

    }

    public static void fizzBuzz(int num) {
        for (var i = 1; i <= num; i++) {
            if (i % 15 == 0)
                System.out.println("The number is " + i + " and is divisible by 3 AND 5. FIZZBUZZ.");
            else if (i % 3 == 0)
                System.out.println("The number is " + i + " and is divisible by 3. Very Fizzy.");
            else if (i % 5 == 0)
                System.out.println("The number is " + i + " and is divisible by 5. Very Buzzy");
            else
                System.out.println("The number is " + i + " and is neither Fizzy nor Buzzy.");
        }
    }
    }
