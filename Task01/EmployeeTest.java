package DSA;

abstract class Employee {
    String name;
    public Employee(String name) { this.name = name; }
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee(String name, double salary) {
        super(name);
        this.monthlySalary = salary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    public PartTimeEmployee(String name, int hours, double rate) {
        super(name);
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Alice", 30000);
        Employee emp2 = new PartTimeEmployee("Bob", 50, 400);

        System.out.println(emp1.name + "'s Salary: ₹" + emp1.calculateSalary());
        System.out.println(emp2.name + "'s Salary: ₹" + emp2.calculateSalary());
    }
}

