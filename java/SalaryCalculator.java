
public class SalaryCalculator {

    // Constants for salary allowances
    private static final double HRA_RATE = 0.20;
    private static final double DA_RATE = 0.10;

    public static void main(String[] args) {

        // Employee basic salary
        double basicSalary = 30000.00;

        // Calculate allowances
        double hra = basicSalary * HRA_RATE;
        double da = basicSalary * DA_RATE;

        // Calculate gross salary
        double grossSalary = basicSalary + hra + da;

        // Display salary details
        System.out.println("----- Salary Details -----");
        System.out.println("Basic Salary: Rs. " + basicSalary);
        System.out.println("HRA: Rs. " + hra);
        System.out.println("DA: Rs. " + da);
        System.out.println("Gross Salary: Rs. " + grossSalary);
    }
}
