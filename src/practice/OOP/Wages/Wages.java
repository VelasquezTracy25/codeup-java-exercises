package practice.OOP.Wages;
//syncs to Main 2

public class Wages {
    //Encapsulation
    public static int calculateWage(
            int baseSalary,
            int extraHours,
            int hourlyRate
    ) {
//because i specified "int" as my return type, i need to have a return line
        return baseSalary + (extraHours * hourlyRate);
    }
}
