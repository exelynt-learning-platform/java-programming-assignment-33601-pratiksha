
import java.util.ArrayList;

// Abstract class: provides common structure for all hospital staff.
abstract class Staff {
    // Encapsulation: keep fields private.
    private String name;
    private int age;

    // Constructor to initialize staff details.
    public Staff(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters provide controlled access to private fields.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be greater than zero.");
        }
    }

    // Abstract method: subclasses must provide their own implementation.
    public abstract void displayRole();
}

// Interface: defines a salary calculation contract.
interface Payable {
    double calculateSalary();
}

// Inheritance: Doctor extends the abstract Staff class.
// Interface implementation: Doctor implements Payable.
class Doctor extends Staff implements Payable {
    private double monthlySalary;

    public Doctor(String name, int age, double monthlySalary) {
        super(name, age);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    // Method overriding: Doctor provides its own role description.
    @Override
    public void displayRole() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Role: Doctor");
        System.out.println("Salary: " + calculateSalary());
    }

    // Implementing the Payable interface method.
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// Inheritance: Nurse also extends Staff.
class Nurse extends Staff {
    private String department;

    public Nurse(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Method overriding: Nurse provides its own role description.
    @Override
    public void displayRole() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Role: Nurse");
        System.out.println("Department: " + department);
    }
}

// Main class: filename must be HospitalManagement.java.
public class HospitalManagement {
    public static void main(String[] args) {

        // Create objects of Doctor and Nurse.
        Doctor doctor = new Doctor("Rahul", 35, 80000);
        Nurse nurse = new Nurse("Priya", 28, "Emergency");

        // Runtime polymorphism: Staff references hold subclass objects.
        Staff staff1 = doctor;
        Staff staff2 = nurse;

        System.out.println("===== Hospital Staff Details =====");

        // Calls the overridden method based on the actual object.
        staff1.displayRole();

        System.out.println();

        staff2.displayRole();

        // Optional: Store different staff objects in an ArrayList.
        ArrayList<Staff> staffList = new ArrayList<>();
        staffList.add(doctor);
        staffList.add(nurse);

        System.out.println("\n===== Staff List =====");

        // Iterate using Staff references.
        for (Staff staff : staffList) {
            staff.displayRole();
            System.out.println("--------------------");
        }
    }
}
