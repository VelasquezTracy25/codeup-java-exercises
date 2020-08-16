package Practice.OOP.Wages;

public class Employees {
    public int baseSalary;
    public int hourlyRate;

    public int calculateWage(int extraHours){ //passed in here bcause it will vary from month to month
    return baseSalary + (hourlyRate * extraHours);}
}
