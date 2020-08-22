package practice.OOP.Wages;

public class Employee { //when instance is created these will be static within them
    public int baseSalary;
    public int hourlyRate;

    public int calculateWage(int extraHours){ //extra house passed as an arg in here because it will vary from month to month
    return baseSalary + (hourlyRate * extraHours);}
}
