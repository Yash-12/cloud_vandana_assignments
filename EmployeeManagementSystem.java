import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
        System.out.println("---------------------------");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create a list to store Employee objects
        List<Employee> employees = new ArrayList<>();

        // Create Employee objects
        Employee emp1 = new Employee(1, "Alice Smith", 75000);
        Employee emp2 = new Employee(2, "Bob Johnson", 60000);
        Employee emp3 = new Employee(3, "Charlie Brown", 50000);

        // Add Employee objects to the list
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        // Display details of each employee
        System.out.println("Employee Details:");
        for (Employee employee : employees) {
            employee.displayDetails();
        }
    }
}