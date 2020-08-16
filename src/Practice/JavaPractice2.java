package Practice;

import java.text.NumberFormat;
import java.util.Scanner;

public class JavaPractice2 {
    public static void main(String[] args) {

//Math Object


        //Returns 1 - rounds like normal humans
        int result = Math.round(1.1F);
        System.out.println(result);

        //Returns 2.0 - rounds to next full int (after)
        double result2 = Math.ceil(1.1F);
        System.out.println(result2);

        //Returns 1.0 - rounds to last full int (before)
        double result3 = Math.floor(1.1F);
        System.out.println(result3);

        //Returns 2 - returns higher of two arguments
        int result4 = Math.max(1, 2); //first implementation return int, but you can use double, float, long as well
        System.out.println("max number between 1 and 2: " + result4);

        //Return random number between your range (1-100)
        double result5 = Math.random() * 100;
        System.out.println("Random number between 1-100: " + result5); //returned 77.846666 if you want whole num look to the next example

        //return random WHOLE number between your range with implicit casting
        double result6 = Math.round(Math.random() * 100);
        System.out.println("Random WHOLE number (with a decimal) between 1-100: " + result6);

        //return random WHOLE number between your range with explicit casting
        int result7 = (int) Math.round(Math.random() * 100); //int result7 wont work on its own, but you can add (int) after the equals since you know your random number will be less than 100.
        System.out.println("Random WHOLE number between 1-100: " + result7);

//Formatting Numbers

        //1234567.910 - you want represented as money with commas on each 3 numbers and a decimal
         NumberFormat currency = NumberFormat.getCurrencyInstance(); //factory method
         String currencyResult = currency.format(1234567.891);
        System.out.println("souting currency by itself: " + currency); //prints java.text.DecimalFormat@67500
        System.out.println("souting currency formatted like $$$: " + currencyResult); //prints $1,234,567.89

        //.123  - you want represented percent //shift and f6 to rename variable
        String percentageResult = NumberFormat.getPercentInstance().format(0.12345); //method chaining by adding .format() at the end of NumberFormat.getPercentInstance()
        System.out.println("souting percentage formatted like %%%: " + percentageResult); //prints 12%


// User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        byte age = scanner.nextByte();
        System.out.println("You are " + age + " years old!");
        System.out.println("Type out your name");
        String name =scanner.nextLine().trim();
        System.out.println("Welcome " + name);
















    }
}
