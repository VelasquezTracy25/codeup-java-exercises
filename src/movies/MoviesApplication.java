package movies;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        runApp();
    }

    public static void runApp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do?\n" +
                "        0 - exit\n" +
                "        1 - view all movies\n" +
                "        2 - view movies in the animated category\n" +
                "        3 - view movies in the drama category\n" +
                "        4 - view movies in the horror category\n" +
                "        5 - view movies in the scifi category");
        int userPick = scanner.nextInt();

        if (userPick == 0) {
            System.out.println("Exiting...");
        } else if (userPick == 1) {
            System.out.print("Displaying all movies: \n");
            Movie[] movies = MoviesArray.findAll();
            rerun();
        } else if (userPick == 2) {
            System.out.println("Displaying all animated movies: \n");
            categorizeMovies("animated");
            rerun();
        } else if (userPick == 3) {
            System.out.println("Displaying all drama movies: \n");
            categorizeMovies("drama");
            rerun();
        } else if (userPick == 4) {
            System.out.println("Displaying all horror movies: \n");
            categorizeMovies("horror");
            rerun();
        } else if (userPick == 5) {
            System.out.println("Displaying all scifi movies: \n");
            categorizeMovies("scifi");
            rerun();
        }
    }

    public static void categorizeMovies(String category) {
        for (Movie movie : MoviesArray.findAll()) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                //Display the movie.
                System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
            }
        }
    }


    public static void rerun() {
        Scanner scannerific = new Scanner(System.in);
        System.out.println("\nSearch again?");
        String yesNo = scannerific.nextLine().toLowerCase();
        if ((yesNo.equals("yes")) || (yesNo.equals("y"))) {
            runApp();
        } else {
            System.out.println("Exiting...");
        }
    }
}
