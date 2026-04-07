class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        double allowance = baseSalary * 0.05;
        return baseSalary + allowance;
    }
}

class Manager extends Employee {
    private static final double MANAGEMENT_BONUS = 2000.00;

    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + MANAGEMENT_BONUS;
    }
}

class Executive extends Manager {
    public Executive(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        double performanceIncentive = this.baseSalary * 0.10;
        return super.calculateSalary() + performanceIncentive;
    }
}

public class Payroll {
    public static void display(Employee emp) {
        System.out.printf("Name: %-8s  Total Salary: %,.2f%n", 
            emp.name, emp.calculateSalary());
    }
    public static void main(String[] args) {
        Employee alice = new Employee("Alice", 10000);
        Manager bob = new Manager("Bob", 10000);
        Executive charlie = new Executive("Charlie", 10000);

        display(alice);
        display(bob);
        display(charlie);
    }

    
}