import java.util.Scanner;

public class Person {

/* 1. Object basics */
//Create Person class inside of src that has a private name property that is a string;

private String name;


//Getter
    //TODO: return the person's name
    public String getName() {
        return name;
    }


//Setter
    //TODO: change the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }

    //TODO: print a message to the console using the person's name
    public void sayHello() {
        System.out.println(String.format("Hello, %s", name));
    }

//The class should have a constructor that accepts a `String` value and sets the person's name to the passed string.

    //Constructor
//    public Person(String name) {
//        setName(name);
//    }

    public Person(String name) {
        this.name = name;
    }


//Create a `main` method on the class that creates a new `Person` object and tests the above methods.

    public static void main(String[] args) {
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // Are the same so they should equal. (Was right)
//        System.out.println(person1 == person2); ///False

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1 == person2); //True, in the first example, person1 and person2 were not equal but since we created person 2 and set to equal to person1, they are now equals

//        Person person1 = new Person("John");
//        Person person2 = person1; //unlike JS where it creates a copy, sets up an alias that points to the same address. If you make a change to person2 happens to person1 and vice versa
//        System.out.println(person1.getName()); //Prints John
//        System.out.println(person2.getName()); //Prints John
//        person2.setName("Jane"); // now that person 2 has been changed to Jane, person 1 will also change because of line 54
//        System.out.println(person1.getName()); //Prints Jane
//        System.out.println(person2.getName()); //Prints Jane
    }
}