package practice.OOP.Wages;

public class Main2 {
    public static void main(String[] args) {
        var employee1 = new Employee();
//        employee1.setBaseSalary(-1);
        employee1.baseSalary = 50_000;
        employee1.hourlyRate = 20;
        int wage1 = employee1.calculateWage(20);
        System.out.println(wage1);

        var employee2 = new Employee();
        employee1.baseSalary = 90_000;
        employee1.hourlyRate = 230;
        int wage2 = employee1.calculateWage(20);
        System.out.println(wage2);
    }

}
