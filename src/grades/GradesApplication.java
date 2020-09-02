package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    static Input input = new Input();

    //Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students. It should have keys that are strings that represent github usernames, and values that are Student objects. Create at least 4 student objects with at least 3 grades each, and add them to the map.

    public static void main(String[] args) {


        HashMap<String, Student> students = new HashMap<>();

        Student tracyVelasquez = new Student("Tracy", "Velasquez");
        tracyVelasquez.addGrade(90);
        tracyVelasquez.addGrade(80);
        tracyVelasquez.addGrade(100);

        Student vanessaRodriguez = new Student("Vanessa", "Rodriguez");
        vanessaRodriguez.addGrade(90);
        vanessaRodriguez.addGrade(30);
        vanessaRodriguez.addGrade(100);

        Student jesseGarza = new Student("Jesse", "Garza");
        jesseGarza.addGrade(90);
        jesseGarza.addGrade(100);
        jesseGarza.addGrade(100);


        Student brianBarton = new Student("Brian", "Barton");
        brianBarton.addGrade(80);
        brianBarton.addGrade(100);
        brianBarton.addGrade(100);

        students.put("VelasquezTracy25", tracyVelasquez);
        students.put("JesseIsCool", jesseGarza);
        students.put("Vanessa56", vanessaRodriguez);
        students.put("ExternalServerBrian", brianBarton);


        System.out.println("Welcome to the Hyperion Cohort! \n Please make a selection. \n");
        System.out.println("\t0 - exit\n" +
                "\t1 - Search for a student\n" +
                "\t2 - See all student grades\n" +
                "\n" + "Select a number option.");



        Scanner scanner = new Scanner(System.in);
        int userSelection = scanner.nextInt();

        if (userSelection == 0) {
            System.out.println("Exiting...");
        } else if (userSelection == 1) {
            cli(students);
        } else if (userSelection == 2) {
            System.out.println("\n\nDisplaying all student grades \n");
        } else {
            System.out.println("\nEnter a valid number.\n\n");
        }
    }

    public static void cli(HashMap<String, Student> students) {
        do {
            System.out.println("\nYou are now viewing the students in Hyperion cohort:\n");
            for (String key : students.keySet()) {
                System.out.print(key + " | ");
            }
            String studentSelector = input.getString("\n\nWhat student would you like to see more information on?\n");
            if (students.containsKey(studentSelector)) {
                Student currentStudentName = students.get(studentSelector);
                System.out.println(String.format("\n\tName: %s \n\tGitHub Username: %s \n\tCurrent Average: %.2f ",
                        currentStudentName.getName(),
                        studentSelector,
                        currentStudentName.getGradeAverage()));
                System.out.println(String.format("\nHere are all grades for %s:\n\n\tTest 1: %s \n\tQuiz 1: %s \n\tExercise 1 : %s",
                        currentStudentName.getName(),
                        currentStudentName.getGrades().get(0),
                        currentStudentName.getGrades().get(1),
                        currentStudentName.getGrades().get(2)));
            } else {
                System.out.println("\nSorry, cannot find student with the username of \"" + studentSelector + "\".");
            }
//            System.out.println("\nWould you like to search again?");
        } while (input.yesNo("\nWould you like to search again?"));
        System.out.println("Goodbye, and have a wonderful day.");
    }
}
