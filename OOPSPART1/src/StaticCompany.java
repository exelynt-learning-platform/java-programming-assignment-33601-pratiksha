
class Employee{
    // Instance variables: each employee has their own name and salary
    String name;
    double salary;

    // Static variables: shared by all Employee objects
    static String companyName = "Tech Solutions";
    static int employeeCount = 0;

    // Constructor initializes employee details
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;

        // Increment static employeeCount whenever an object is created
        employeeCount++;
    }

    // Instance method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: Rs. " + salary);
        System.out.println("Company: " + companyName);
    }

    // Static method can be called using the class name
    static void displayCompany() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Total Employees: " + employeeCount);
    }

}


public class StaticCompany {

    public static void main(String[] args) {

        // Create multiple Employee objects
        Employee emp1 = new Employee("Rahul", 50000);
        Employee emp2 = new Employee("Priya", 60000);
        Employee emp3 = new Employee("Amit", 45000);

        // Display individual employee details
        System.out.println("----- Employee Details -----");
        emp1.displayDetails();

        System.out.println();
        emp2.displayDetails();

        System.out.println();
        emp3.displayDetails();

        // All objects share the same static companyName
        System.out.println("\n----- Shared Static Information -----");

        // Change the static variable using the class name
        Employee.companyName = "Global Technologies";

        // Call static method without creating an object
        Employee.displayCompany();
    }
}