
/**
 * Parent class representing a general notification.
 */
class Notification {

    /**
     * Method to send a general notification.
     */
    public void send() {
        System.out.println("Sending a general notification...");
    }
}

/**
 * Child class that overrides the send() method.
 */
class EmailNotification extends Notification {

    /**
     * Overrides the parent class send() method.
     * Calls the parent method using super.send().
     */
    @Override
    public void send() {

        // Call the parent class send() method
        super.send();

        // Provide additional email-specific functionality
        System.out.println("Sending an email notification...");
        System.out.println("Email sent successfully!");
    }
}

/**
 * Main class to demonstrate method overriding.
 */
public class NotificationOverride {

    public static void main(String[] args) {

        // Create an object of the parent class
        Notification notification = new Notification();

        // Call the parent class send() method
        System.out.println("===== GENERAL NOTIFICATION =====");
        notification.send();

        System.out.println();

        // Create an object of the child class
        EmailNotification email = new EmailNotification();

        // Call the overridden send() method
        System.out.println("===== EMAIL NOTIFICATION =====");
        email.send();
    }
}
