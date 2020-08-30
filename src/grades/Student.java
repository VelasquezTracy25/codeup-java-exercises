package grades;

//It should have private properties for the student's name, and grades. The grades property should be an ArrayList of integers. The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList.

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String studentFirstName;
    private String studentLastName;
    //import ArrayListClass on line 11
    static private ArrayList<Integer> grades;


    public Student(String studentFirstName, String studentLastName) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.grades = new ArrayList<Integer>(); //intelliJ recommended changing to"<Integer>"
         }

    //The Student class should have the following methods:
    // returns the student's name
    public String getName() {
        return this.studentFirstName + " " + this.studentLastName;
    }

    public ArrayList<Integer> getGrades() {
        return (ArrayList) this.grades;

    }

    // adds the given grade to the grades property
    //add() is an arrayList method
    public void addGrade(int grade) {
        this.grades.add(grade);
        //add() - inserts specified element at the  of the list.
    }

    // returns the average of the students grades
    public float getGradeAverage() {
        int sum = 0;
        for (Integer grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
        //Size is a List util list method - Returns the number of elements in this list.
    }

//    Test your Student class by adding a main method and creating Student objects. Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.

    public static void main(String[] args) {

//        HashMap<String, Student> students = new HashMap<>();
//
//
//        Student tracyVelasquez = new Student("Tracy", "Velasquez");
//        tracyVelasquez.addGrade(90);
//        tracyVelasquez.addGrade(80);
//        tracyVelasquez.addGrade(100);
//        System.out.println(
//                tracyVelasquez.studentFirstName + " " + tracyVelasquez.studentLastName + "'s average is:" + tracyVelasquez.getGradeAverage());
//
//        Student vanessaRodriguez = new Student("Vanessa", "Rodriguez");
//        vanessaRodriguez.addGrade(90);
//        vanessaRodriguez.addGrade(90);
//        vanessaRodriguez.addGrade(100);
//        System.out.println(
//                vanessaRodriguez.studentFirstName + " " + vanessaRodriguez.studentLastName + "'s average is:" + vanessaRodriguez.getGradeAverage());
//
//        Student jesseGarza = new Student("Jesse", "Garza");
//        jesseGarza.addGrade(90);
//        jesseGarza.addGrade(100);
//        jesseGarza.addGrade(100);
//        System.out.println(
//                jesseGarza.studentFirstName + " " + jesseGarza.studentLastName + "'s average is:" + jesseGarza.getGradeAverage());
//        System.out.println(jesseGarza.grades);
//
//        Student brianBarton = new Student("Brian", "Barton");
//        jesseGarza.addGrade(80);
//        jesseGarza.addGrade(100);
//        jesseGarza.addGrade(100);
//        System.out.println(
//                brianBarton.studentFirstName + " " + brianBarton.studentLastName + "'s average is:" + brianBarton.getGradeAverage());
//        System.out.println(brianBarton.grades);
//
//        students.put("VelasquezTracy25", tracyVelasquez);
//        students.put("JesseIsCool", jesseGarza);
//        students.put("Vanessa56", vanessaRodriguez);
//        students.put("ExternalServerBrian", brianBarton);
    }
}

