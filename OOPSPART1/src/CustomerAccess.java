/*
 * Customer class demonstrates encapsulation
 * by protecting private fields using getters and setters.
 */
class Customer{
    // private: Accessible only within the Customer class.
    private String name;

    // private: Accessible only within the Customer class.
    private double balance;

    // public: Accessible from anywhere.
    public String branch;

    // public constructor: Can be called from other classes.
    public Customer(String name, double balance, String branch) {
        this.name = name;
        this.balance = balance;
        this.branch = branch;
    }

    // public getter: Returns the private name field.
    public String getName() {
        return name;
    }

    // public setter: Updates the private name field.
    public void setName(String name) {
        this.name = name;
    }

    public double getBalance(){
        return balance;
    }

    public String getBranch(){
        return branch;
    }

    public void setBranch(){
        this.branch = branch;
    }

    // public setter: Updates the private balance field.
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }
}

public class CustomerAccess {

    public static void main(String[] args){

        Customer customers = new Customer(
                "Pratiksha",
                250000,
                "Pune"
        );
        // Display private fields using public getter methods.
        System.out.println("Customer Details:");
        System.out.println("Name :" + customers.getName() );
        System.out.println("Balance :" + customers.getBalance());

        // Access public field directly.
        System.out.println("Branch: " + customers.branch);

        // Update private fields using public setter methods.
        customers.setName("Priya");
        customers.setBalance(7500.00);

        // Update public field directly.
        customers.branch = "Pune";

        // Display updated private fields using getter methods.
        System.out.println("\nUpdated Customer Details:");
        System.out.println("Name: " + customers.getName());
        System.out.println("Balance: Rs. " + customers.getBalance());
        System.out.println("Branch: " + customers.branch);

    }
}
