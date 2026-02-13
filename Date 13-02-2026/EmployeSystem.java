class Employee{
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    void displayEmployeeDetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Total Salary: "+salary);
    }
}

class Manager extends Employee{
    float bonus;

    Manager(float bonusAmount,String name,int id,double salary){
        super(name, id, salary);
        bonus=bonusAmount;
    }
    void calculateTotalSalary(){
        this.salary+=bonus;
        displayEmployeeDetails();
    }
}

public class EmployeSystem {
    public static void main(String[] args) {
        Manager m1 = new Manager(1000, "Aditya", 101, 100000);
        System.out.println("Original Details: ");
        m1.displayEmployeeDetails();
        System.out.println("\nNew Details: ");
        m1.calculateTotalSalary();
    }
}
