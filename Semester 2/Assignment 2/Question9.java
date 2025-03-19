class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void displayManagerDetails() {
        super.displayEmployeeInfo();
        System.out.println("Department: " + department);
    }
}

public class Question9 {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 80000, "IT");
        m.displayManagerDetails();
    }
}
