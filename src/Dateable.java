import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {

        // Set up the scanner for input
        Scanner scanner = new Scanner(System.in);
        int age;
        // Ask the user for their age
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        // Work out half of the age
        int halfAge = age / 2;
        // Add 7 to the half age to find the minimum dating age
        int youngestDateAge = halfAge + 7;
        // Print out the result
        System.out.println(age + "-year olds should date somebody who is at least " + youngestDateAge + " years old.");

    }
}
