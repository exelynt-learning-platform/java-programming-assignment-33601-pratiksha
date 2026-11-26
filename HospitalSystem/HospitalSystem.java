// Import Doctor class from hospitalutils package.
import hospitalutils.Doctor;

// Import LocalDate from Java standard library.
import java.time.LocalDate;

// Main class of the hospital system.
public class HospitalSystem {

    public static void main(String[] args) {

        // Display current date using Java standard library.
        LocalDate today = LocalDate.now();

        System.out.println("Hospital Management System");
        System.out.println("Date: " + today);
        System.out.println("======================");

        // Create multiple Doctor objects.
        Doctor doctor1 = new Doctor("Rahul Sharma", "Cardiologist");

        Doctor doctor2 = new Doctor("Priya Patil", "Dermatologist");

        Doctor doctor3 = new Doctor("Amit Verma", "Neurologist");

        // Call displayInfo() for each doctor.
        doctor1.displayInfo();

        doctor2.displayInfo();

        doctor3.displayInfo();
    }
}