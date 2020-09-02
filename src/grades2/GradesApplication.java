package grades2;

import grades.Student;

import java.util.HashMap;

public class GradesApplication{
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        grades.Student tracy = new grades.Student("Tracy", "Velasquez");
        tracy.addGrade(100);
        tracy.addGrade(95);
        tracy.addGrade(80);
        grades.Student brian = new grades.Student("Brian", "Kielty");
        brian.addGrade(100);
        brian.addGrade(90);
        brian.addGrade(86);
        grades.Student sam = new grades.Student("Sam", "Iam");
        sam.addGrade(100);
        sam.addGrade(100);
        sam.addGrade(100);
        grades.Student mariah = new grades.Student("Mariah", "Carey");
        sam.addGrade(100);
        sam.addGrade(100);
        sam.addGrade(100);
        System.out.println(tracy.getGradeAverage());
        System.out.println(brian.getGradeAverage());
        System.out.println(sam.getGradeAverage());
        System.out.println(mariah.getGradeAverage());

        students.put("VelasquezTracy25", tracy);
        students.put("JesseIsCool", brian);
        students.put("Vanessa56", sam);
        students.put("ExternalServerBrian", mariah);
    }
}
