package grades2;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Integer> grades;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = new ArrayList<Integer>();
    }

    // returns the student's name
    public String getName() {
        return firstName + " " + lastName;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int gradesTotal = 0;
        for (int grade : grades) {
            gradesTotal += grade;
        }
        return gradesTotal / grades.size();
    }


    public static void main(String[] args) {

    }
}