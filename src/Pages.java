import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {

        // Set up the scanner for input
        Scanner scanner = new Scanner(System.in);

        // Declare the variable for age
        int age;

        // Ask the user for their age
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        // Calculate the pages to read (100 minus age)
        int pagesToRead = 100 - age;
        // Print out the result
        System.out.println(age + "-year olds should read at least " + pagesToRead + " pages before giving up on a book.");
        // Close the scanner

    }
}
