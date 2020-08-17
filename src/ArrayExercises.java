import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayExercises {

    //Array Basics
//Create a class inside of src named ArraysExercises. Create a main method for this class to do your work.
    public static void main(String[] args) {

//What happens when you run the following code? Why is Arrays.toString necessary?
//To print array as a string as opposed to it's memory location.

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        System.out.println(Arrays.toString(numbers)); //Needs Arrays.toString to return a string representation of the array.

//Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

        String roomies[] = new String[3];
        roomies[0] = "Tracy";
        roomies[1] = "Lucy";
        roomies[2] = "Luna";
        System.out.println(Arrays.toString(roomies));


        addPerson("Jesse");
        addPerson("Tommy");
    }
//Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

        public static void addPerson(String newPerson){

        //original array
        String[] persons = {"Tracy", "Brian", "Vanessa"};

        //creating new list/array
        ArrayList<String> newPersons = new ArrayList<>();

        //add new person name
        newPersons.add(newPerson);

        //Loops over the array and add each element separately.
        for (String person : persons) {
                newPersons.add(person);
            }

        //sout toString to see readable list.
        System.out.println(newPersons.toString());

}


}
