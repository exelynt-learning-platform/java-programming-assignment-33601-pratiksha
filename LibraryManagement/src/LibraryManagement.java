
/**
 * Book class represents a book in the library.
 * Demonstrates encapsulation, constructors, static variables
 * and method overloading.
 */
class Book {

    // Private instance variables (Encapsulation)
    private String title;
    private String author;
    private double price;

    // Static variable shared by all Book objects
    static String libraryName = "City Central Library";

    /**
     * Default constructor.
     * Initializes book details with default values.
     */
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    /**
     * Parameterized constructor.
     * Initializes book details using supplied values.
     */
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    /**
     * Displays book and library details.
     */
    public void displayDetails() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Book Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: Rs. " + this.price);
        System.out.println("----------------------------");
    }

    /**
     * Calculates fine based on the number of late days.
     * Fine is Rs. 10 per late day.
     *
     * @param lateDays number of days the book is returned late
     * @return calculated fine
     */
    public double calculateFine(int lateDays) {
        return lateDays * 10.0;
    }

    /**
     * Overloaded method that calculates fine after applying
     * a member discount.
     *
     * @param lateDays number of late days
     * @param memberDiscount discount percentage for members
     * @return fine after discount
     */
    public double calculateFine(int lateDays, double memberDiscount) {
        double fine = calculateFine(lateDays);
        return fine - (fine * memberDiscount / 100);
    }
}

/**
 * Main class to demonstrate Library Management functionality.
 */
public class LibraryManagement {

    /**
     * Main method: program execution starts here.
     */
    public static void main(String[] args) {

        // Create three Book objects using parameterized constructor
        Book book1 = new Book(
                "Java Programming",
                "James Gosling",
                550.00
        );

        Book book2 = new Book(
                "Clean Code",
                "Robert C. Martin",
                750.00
        );

        // Create a Book object using the default constructor
        Book book3 = new Book();

        // Display details of all books
        System.out.println("===== LIBRARY BOOK DETAILS =====");

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();

        // Demonstrate fine calculation
        System.out.println("===== FINE CALCULATION =====");

        // Calculate fine without discount
        System.out.println(
                "Fine for 5 late days: Rs. " +
                        book1.calculateFine(5)
        );

        // Calculate fine with 20% member discount
        System.out.println(
                "Fine for 5 late days with 20% discount: Rs. " +
                        book1.calculateFine(5, 20.0)
        );

        // Calculate fine for another book
        System.out.println(
                "Fine for 3 late days: Rs. " +
                        book2.calculateFine(3)
        );
    }
}
