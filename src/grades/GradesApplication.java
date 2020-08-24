package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    static Input input = new Input();

    //Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students. It should have keys that are strings that represent github usernames, and values that are Student objects. Create at least 4 student objects with at least 3 grades each, and add them to the map.

    public static void main(String[] args) {

        Student tracyVelasquez = new Student("Tracy", "Velasquez");
        tracyVelasquez.addGrade(90);
        tracyVelasquez.addGrade(80);
        tracyVelasquez.addGrade(100);

        Student vanessaRodriguez = new Student("Vanessa", "Rodriguez");
        vanessaRodriguez.addGrade(90);
        vanessaRodriguez.addGrade(90);
        vanessaRodriguez.addGrade(100);

        Student jesseGarza = new Student("Jesse", "Garza");
        jesseGarza.addGrade(90);
        jesseGarza.addGrade(100);
        jesseGarza.addGrade(100);


        Student brianBarton = new Student("Brian", "Barton");
        brianBarton.addGrade(80);
        brianBarton.addGrade(100);
        brianBarton.addGrade(100);


        HashMap<String, Student> students = new HashMap<>();

        students.put("VelasquezTracy25", tracyVelasquez);
        students.put("JesseIsCool", jesseGarza);
        students.put("Vanessa56", vanessaRodriguez);
        students.put("ExternalServerBrian", brianBarton);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Hyperion Cohort! Please make a selection. \n\n" +
                "\t0 - exit\n" +
                "\t1 - Search for a student\n" +
                "\t2 - See all student grades\n" +
                "\n" + "Select a number option.");
        int userSelection = scanner.nextInt();

        if (userSelection == 0) {
            System.out.println("Exiting...");
        } else if (userSelection == 1) {
            finalGrades(students);
        } else if (userSelection == 2) {
            System.out.println("\n\nDisplaying all student grades \n");
        } else {
            System.out.println("\nEnter a valid number.\n\n");
        }
    }


    public static void finalGrades(HashMap<String, Student> students) {
        do {
            for (String key : students.keySet()) {
                System.out.print(key + " | ");
            }

            System.out.println("\n \nWhat student would you like to see more information on?\n");
            String studentSelector = input.getString();

            if (students.containsKey(studentSelector)) {

                Student currentStudentName = students.get(studentSelector);

                System.out.println(String.format("\n\tName: %s \n\tGitHub Username: %s \n\tCurrent Average: %.2f",
                        currentStudentName.getName(), studentSelector, currentStudentName.getGradeAverage()));
                System.out.println(String.format("\nHere are all grades for %s:\n", currentStudentName.getName()));
                System.out.println(String.format("\tTest 1: %s \n\tQuiz 1: %s \n\tExercise 1 : %s", currentStudentName.getGrades().get(0), currentStudentName.getGrades().get(1), currentStudentName.getGrades().get(2)));
                input.yesNo("Would you like to view another students grades?");
            } else {
                System.out.println("Sorry, cannot find student with the username of \"" + studentSelector + ".");
            }
        } while (input.yesNo("Would you like to try again."));

        System.out.println("Thank you for visiting!");

    }

}

