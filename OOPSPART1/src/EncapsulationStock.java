
/**
 * Product class demonstrates Encapsulation.
 * Private variables protect product data from direct access.
 */
class Product {

    // Private fields (Encapsulation)
    private String name;
    private double price;
    private int quantity;

    /**
     * Constructor to initialize product details.
     */
    public Product(String name, double price, int quantity) {
        this.name = name;
        setPrice(price);
        setQuantity(quantity);
    }

    // Getter method to access product name
    public String getName() {
        return name;
    }

    // Setter method to update product name
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid product name!");
        }
    }

    // Getter method to access product price
    public double getPrice() {
        return price;
    }

    // Setter method to update price with validation
    // Price must be greater than zero
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price! Price must be greater than 0.");
        }
    }

    // Getter method to access product quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter method to update quantity with validation
    // Quantity must be zero or greater
    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Invalid quantity! Quantity cannot be negative.");
        }
    }

    /**
     * Method to display product details.
     * Uses getters to access private fields.
     */
    public void displayDetails() {
        System.out.println("Product Name: " + getName());
        System.out.println("Product Price: Rs. " + getPrice());
        System.out.println("Product Quantity: " + getQuantity());
        System.out.println("----------------------------");
    }
}

/**
 * Main class to demonstrate Encapsulation.
 */
public class EncapsulationStock {

    public static void main(String[] args) {

        // Create Product object
        Product product = new Product("Laptop", 55000.00, 10);

        // Display initial product details
        System.out.println("===== INITIAL PRODUCT DETAILS =====");
        product.displayDetails();

        // Update product fields using setter methods
        System.out.println("===== UPDATING PRODUCT DETAILS =====");

        product.setName("Gaming Laptop");
        product.setPrice(65000.00);
        product.setQuantity(15);

        // Display updated product details
        product.displayDetails();

        // Test price validation
        System.out.println("===== TESTING VALIDATION =====");

        product.setPrice(-500);

        // Test quantity validation
        product.setQuantity(-5);

        // Display details to verify invalid values were rejected
        System.out.println("===== FINAL PRODUCT DETAILS =====");
        product.displayDetails();

        // Access private fields through getter methods
        System.out.println("Product Name using getter: " + product.getName());
        System.out.println("Product Price using getter: " + product.getPrice());
        System.out.println("Product Quantity using getter: " + product.getQuantity());
    }
}
