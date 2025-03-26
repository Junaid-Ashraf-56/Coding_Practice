package ExceptionHandling;

import java.util.Scanner;

// Custom Exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {  // Constructor with custom message
        super(message);
    }
}

public class Question2 {
    // Method to check age
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Access Granted");
        }
    }

    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);

        try {
            System.out.println("Enter Age: ");
            int age = abc.nextInt();

            checkAge(age);  // Call the method that throws an exception

        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());  // Catch custom exception
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}
