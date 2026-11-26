import java.util.Scanner;

// Employee class represents an employee with name and salary
 class Employee{

    // Fields to store employee information
    String name;
    double salary;

    // Constructor to initialize employee details
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;

    }

    /*
     * void return type: Does not return any value.
     * Parameters: No parameters are required.
     * Displays employee name and salary.
     */
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Monthly Salary: Rs. " + salary);
    }

    /*
     * double return type: Returns the calculated tax amount.
     * Parameters: No parameters are required.
     * Tax is calculated as 10% of annual salary.
     */
    double calculateTax() {
        double annualSalary = salary * 12;
        double tax = annualSalary * 0.10;

        return tax;
    }
}



// Main class to demonstrate employee methods
public class PayslipMethods {
    public static void main(String[] args){

        // Create Scanner object to read employee information
        Scanner scanner = new Scanner(System.in);

        // Create three Employee objects using user input
        Employee[] employees = new Employee[3];

        for (int i = 0; i < employees.length; i++) {

            System.out.println("\nEnter Employee " + (i + 1) + " Details:");

            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();

            System.out.print("Enter monthly salary: ");
            double salary = scanner.nextDouble();

            scanner.nextLine(); // Consume leftover newline

            // Create Employee object
            employees[i] = new Employee(name, salary);
        }

        // Call methods for all three Employee objects
        System.out.println("\n========== EMPLOYEE PAYSLIPS ==========");

        for (Employee employee : employees) {

            // Call void method to display employee details
            employee.displayDetails();

            // Call double method to calculate and return tax
            double tax = employee.calculateTax();

            System.out.printf("Annual Tax: Rs. %.2f%n", tax);

            System.out.println("---------------------------------------");
        }

        // Close Scanner
        scanner.close();
    
    }
}
