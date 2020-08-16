import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        int principal = (int) readNumber("Principal: ", 1000, 100_000_000);
        float annualInterest = (float) readNumber("Annual Interest: ", 1, 20);
        byte years = (byte) readNumber("Period (Years): ", 0, 50);

        System.out.println("Your Principal is: $" + principal + ".\n" +
        "Your Monthly Interest Rate is: " + (annualInterest/12) + "%. \n" + "You will take " + years + " years to pay off you mortgage.");

    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanny = new Scanner(System.in);
        double value;
    while(true){
                System.out.print(prompt);
                value = scanny.nextFloat();
                if (value >= min && value <=max)
                break;
                System.out.println("Enter a value between " + min + "and " + max);
            }
            return value;
    }

}
