
import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {

        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask how many employees to process (3 to 5)
        System.out.print("Enter number of employees (3-5): ");
        int employeeCount = scanner.nextInt();

        // Validate employee count
        if (employeeCount < 3 || employeeCount > 5) {
            System.out.println("Please enter between 3 and 5 employees.");
            scanner.close();
            return;
        }

        // Loop through each employee
        for (int i = 1; i <= employeeCount; i++) {

            System.out.println("\nEmployee " + i);

            // Read employee name
            System.out.print("Enter employee name: ");
            String name = scanner.next();

            // Read ratings in three areas
            System.out.print("Enter rating for Quality (1-5): ");
            double quality = scanner.nextDouble();

            System.out.print("Enter rating for Productivity (1-5): ");
            double productivity = scanner.nextDouble();

            System.out.print("Enter rating for Teamwork (1-5): ");
            double teamwork = scanner.nextDouble();

            // Calculate total and average ratings
            double total = quality + productivity + teamwork;
            double average = total / 3;

            // Assign bonus percentage based on average rating
            double bonus;

            if (average >= 4.5) {
                bonus = 20;
            } else if (average >= 3.5) {
                bonus = 10;
            } else if (average >= 2.5) {
                bonus = 5;
            } else {
                bonus = 0;
            }

            // Display employee performance and bonus
            System.out.println("\n--- Employee Bonus Details ---");
            System.out.println("Employee Name: " + name);
            System.out.println("Total Rating: " + total);
            System.out.printf("Average Rating: %.2f%n", average);
            System.out.println("Bonus Percentage: " + bonus + "%");
        }

        // Close Scanner
        scanner.close();
    }
}
