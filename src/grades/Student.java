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
        this.grades = new ArrayList<Integer>();
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
    public double getGradeAverage() {
        int gradesTotal = 0;
        for (int grade : grades) {
            gradesTotal += grade;
        }
        return gradesTotal / grades.size();
    }
        //Size is a List util list method - Returns the number of elements in this list.

//    Test your Student class by adding a main method and creating Student objects. Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.

    public static void main(String[] args) {

//        grades.Student tracy = new grades.Student("Tracy", "Velasquez");
//        tracy.addGrade(100);
//        tracy.addGrade(95);
//        tracy.addGrade(80);
//        grades.Student brian = new grades.Student("Brian", "Kielty");
//        brian.addGrade(100);
//        brian.addGrade(90);
//        brian.addGrade(86);
//        grades.Student sam = new grades.Student("Sam", "Iam");
//        sam.addGrade(100);
//        sam.addGrade(100);
//        sam.addGrade(100);
//
//        System.out.println(tracy.getGradeAverage());
//        System.out.println(brian.getGradeAverage());
//        System.out.println(sam.getGradeAverage());

//
//        students.put("VelasquezTracy25", tracyVelasquez);
//        students.put("JesseIsCool", jesseGarza);
//        students.put("Vanessa56", vanessaRodriguez);
//        students.put("ExternalServerBrian", brianBarton);
    }
}

