import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ask Bob a question.");
        String userInput = sc.nextLine();


        while (true) {
            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");

            }
            System.out.println("\nWhat about now? ");
            userInput = sc.nextLine();
            }


    }
}
