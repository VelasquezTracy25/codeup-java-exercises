package Practice;

public class JavaPractice4 {
    public static void main(String[] args) {
        //greet
    greet("Tracy", "Velasquez");
    greet("Brian", "Kielty");
    greet("Lucy", "Cat");
    greet("Luna", "Cat");

        System.out.println("Start");
        printNumbers(4);
        System.out.println("Finish");
    }

public static void greet(String firstName, String lastName ){
        System.out.println("Hi " + firstName + " " + lastName + ".");
    }

public static void printNumbers(int limit) {
for (int i= 0; i < limit; i++)
    System.out.println(i);}



}
