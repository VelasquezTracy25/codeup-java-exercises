import java.util.Scanner;

public class ConsoleAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start game? (y/n)");
        String startGame = scanner.next().toLowerCase();
        if ((startGame.equals("y")) || (startGame.equals("yes"))) {
            characterCreation();
        } else if ((startGame.equals("n")) || (startGame.equals("no"))) {
            System.out.println("Okay... game over before it even began.");
        } else {
            System.out.println("Try again.");
        }
    }

    public static void characterCreation() {
        Scanner mainScanner = new Scanner(System.in);
        System.out.println("Enter your name (no spaces)");
        String userName = mainScanner.next();
        System.out.println("WELCOME" + userName + ". \n Let's find out if you would survive the Game of Thrones.");
        System.out.println("" +
                "SELECT YOUR CHARACTER:\n"
                + "-Catelyn Stark, House Tully\n"
                + "-Eddard Stark, House Stark\n"
                + "-Daenerys Targaryen, House Targaryen\n"
                + "-Cersei Lannister, House Lannister\n"
                + "-Stannis Baratheon, House Baratheon\n"
                + "-Olenna Tyrrell, House Tyrrell\n"
                + "-Oberyn Martell, House Martel\n"
        );
    }
}

