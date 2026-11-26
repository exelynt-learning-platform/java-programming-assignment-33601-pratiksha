// Package declaration: Groups related hospital utility classes.
package hospitalutils;

// Public class representing a doctor.
public class Doctor {

    // Instance variables
    String name;
    String specialty;

    // Constructor to initialize doctor details
    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    // Method to display doctor information
    public void displayInfo() {
        System.out.println("Doctor Name: " + name);
        System.out.println("Specialty: " + specialty);
        System.out.println("----------------------");
    }
}