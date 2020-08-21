package practice;

import java.util.Scanner;

public class JavaPractice3 {
    public static void main(String[] args) {

//Boolean Expressions
        int x = 1;
        int y = 1;
        System.out.println(x != y); //returns false

        int temp = 85;
        boolean isWarm = temp > 80 && temp < 100;
        System.out.println(isWarm); //prints true when temp is 85 and false when temp is 60

        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;
        boolean isEligible = hasHighIncome || hasGoodCredit;
        System.out.println(isEligible); //return true because at least one is true

        boolean isNotEligible = hasHighIncome && hasGoodCredit;
        System.out.println(isNotEligible); //return false because at least one is false

        boolean notTrue = false;
        boolean isTrue = !notTrue; //not false = true
        System.out.println(isTrue); //returns true


// If Statements

/*
If temps is greater than 85,
    Its a hot day
    Drink plent of water
If temp is less than 70-84,
    Its a nice day
else
    Its cold
 */

        int temperature = (int) (Math.random() * 105);

        if (temperature > 85) {
            System.out.println("The Temperature is " + temperature + " degrees. Its a hot day.");
            System.out.println("Drink plenty of water");
        } else if (temperature > 85 && temperature <= 70) {
            System.out.println("The Temperature is " + temperature + " degrees. It's a nice day.");
        } else {
            System.out.println("The Temperature is " + temperature + " degrees. It's cold.");
        }


        //Simplifying If Statements

        int income = 120_000;
        boolean hasHighIncome2 = (income > 100_000);
        System.out.println(hasHighIncome2); //returns true


// With Ternary
        String className = income > 100_000 ? "First" : "Economy";
//        if (?) income is great than 100,000 - print first
//        OR (:) if income is less 100,000 - print Economy
        System.out.println(className); //Prints first because 120,000 income from line 56 is greater than 100,000

        switchExercise(); // run switch exercise


//For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World " + i);
            //prints:
            //Hello World 0
            //Hello World 1
            //Hello World 2
            //Hello World 3
            //Hello World 4
        }

//While = work for when we dont know how many times codes needs to run
        int j = 5;
        while (j > 0) {
            System.out.println("Hello World " + j);
            j--;
        }
        //prints:
        //Hello World 5
        //Hello World 4
        //Hello World 3
        //Hello World 2
        //Hello World 1


//If we dont know how many times a user will enter something, use a while loop
        Scanner scanner = new Scanner(System.in);
        String input = ""; //initialize input with an empty string
        while (!input.equals("quit")) { //if input does NOT equal quit
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

//For Each

        String[] fruits = {"Apple", "Mango", "Orange"};


//        //easiest to iterate through array from beginning to end
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }


        //if you'd like to get the index of the element in an array use for loop
        for (int i = 0; i < fruits.length; i++){
            System.out.print("The fruit at index " + i + " is " + fruits[i] + ". \n");

        }
    }

    //Switch Statements
    public static void switchExercise() {
        String role = "admin";
        switch (role) { //define variable (role)
            case "admin":
                System.out.println("You are an admin.");
                break;

            case "moderator":
                System.out.println("You are a moderator.");
                break;

            default:
                System.out.println("You're a guest.");

                // ran this code on line 68 by calling switchExercise() method
        }


    }
}
