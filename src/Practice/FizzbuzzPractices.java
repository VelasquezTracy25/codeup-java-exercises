package Practice;

public class FizzbuzzPractices {
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 100);

        if (randomNumber % 15 == 0)
            System.out.println("The number is " + randomNumber + " and is divisible by 3 AND 5. FIZZBUZZ.");

        else if (randomNumber % 3 == 0)
            System.out.println("The number is " + randomNumber + " and is divisible by 3. Very Fizzy.");

        else if (randomNumber % 5 == 0)
            System.out.println("The number is " + randomNumber + " and is divisible by 5. Very Buzzy");

        else
            System.out.println("The number is " + randomNumber + " and is neither Fizzy nor Buzzy.");
    }

}

