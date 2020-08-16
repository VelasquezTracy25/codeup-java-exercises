import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        //import scanner and assign var
        Scanner mortgageQs = new Scanner(System.in);


        System.out.print("What is Your Principal?");
        int principal = mortgageQs.nextInt();

        System.out.print("Enter your interest rate.");
        float annualInterest = mortgageQs.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = mortgageQs.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
        * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
        / Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);



        System.out.println("Your Principal is: $" + principal + ".\n" +
        "Your Monthly Interest Rate is: " + monthlyInterest + "%. \n" + "You will take " + years + " years to pay off you mortgage.");

    }
}
