package oops;

class Employeee {
    String name;
    int employeeId;

    public Employeee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

class PermanentEmployee extends Employeee {
    double salary;

    public PermanentEmployee(String name, int employeeId, double salary) {
        super(name, employeeId);
        this.salary = salary;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Salary: $" + salary);
    }
}

class TemporaryEmployee extends Employeee {
    int contractDuration;

    public TemporaryEmployee(String name, int employeeId, int contractDuration) {
        super(name, employeeId);
        this.contractDuration = contractDuration;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Contract Duration: " + contractDuration + " months");
    }
}

class HourlyEmployee extends Employeee {
    double hourlyRate;

    public HourlyEmployee(String name, int employeeId, double hourlyRate) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Hourly Rate: $" + hourlyRate);
    }
}

public class EmployeeHierarchy {
    public static void main(String[] args) {
        PermanentEmployee permanentEmployee = new PermanentEmployee("John", 101, 50000);
        TemporaryEmployee temporaryEmployee = new TemporaryEmployee("Jane", 102, 6);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Doe", 103, 15.5);

        System.out.println("Permanent Employee Details:");
        permanentEmployee.displayDetails();
        System.out.println();

        System.out.println("Temporary Employee Details:");
        temporaryEmployee.displayDetails();
        System.out.println();

        System.out.println("Hourly Employee Details:");
        hourlyEmployee.displayDetails();
    }
}
