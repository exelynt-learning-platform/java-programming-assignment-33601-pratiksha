
public class TableLoops {

    public static void main(String[] args) {

        // 1. Print multiplication table from 1 to 10 using for loop
        int number = 5;

        System.out.println("Multiplication Table of " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // 2. Print countdown using while loop
        System.out.println("\nCountdown:");

        int count = 10;

        while (count >= 1) {
            System.out.println(count);
            count--;
        }

        // 3. Print even numbers from 1 to 10 using do-while
        System.out.println("\nEven Numbers from 1 to 10:");

        int even = 1;

        do {
            if (even % 2 == 0) {
                System.out.println(even);
            }
            even++;
        } while (even <= 10);

        // 4. Iterate subject names using enhanced for loop
        System.out.println("\nSubjects:");

        String[] subjects = {
                "Java",
                "PHP",
                "JavaScript",
                "React",
                "Node.js"
        };

        for (String subject : subjects) {

            // Skip PHP using continue
            if (subject.equals("PHP")) {
                continue;
            }

            // Stop the loop when React is found using break
            if (subject.equals("React")) {
                break;
            }

            System.out.println(subject);
        }
    }
}
