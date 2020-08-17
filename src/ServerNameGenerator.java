import java.util.Random;
import java.util.Scanner;

public class ServerNameGenerator {
    /*Server Name Generator

    We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.


    Example Output

        Here is your server name:
        dedicated-photon
        Movie List

        We are going to build an application that keeps track of movies and displays them by category.

    */
    public static void main(String[] args) {

//Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.

        randomNameGen();
    }

    public static void randomNameGen() {

//Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.

        String adjectives[] = new String[10];
        adjectives[0] = "Lamentable";
        adjectives[1] = "Cultured";
        adjectives[2] = "Dapper";
        adjectives[3] = "Fabulous";
        adjectives[4] = "Cruel";
        adjectives[5] = "Colorful";
        adjectives[6] = "Greasy";
        adjectives[7] = "Hallowed";
        adjectives[8] = "Festive";
        adjectives[9] = "Irritated";


        String[] nouns = {"Bubble", "Line", "Unit", "Whistle", "Breath", "Wrist", "Death", "Ghost", "Squirrel", "Hammer"};

        while(true) {
            System.out.println("Press enter to generate your cool name!");
            Scanner scanny = new Scanner(System.in);
            String response = scanny.nextLine();
            if (response.length() != 0) {
                break;
            }
            int randomNoun = (int) (Math.random() * 10);
            int randomAdj = (int) (Math.random() * 10);
            System.out.println(adjectives[randomNoun] + "-" + nouns[randomAdj]);
        }
    }
}
