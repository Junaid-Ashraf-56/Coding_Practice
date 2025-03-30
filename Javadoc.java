import java.util.Scanner;

/**
 * Represents an exception for insufficient funds in a bank account.
 * This exception is thrown when a withdrawal amount exceeds the available balance.
 *
 * @author Junaid Ashraf
 * @version 2.0
 */
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

/**
 * Represents a bank account with basic operations such as deposit, withdraw, and balance check.
 */
class BankAccount {
    private String accountNumber;
    private double balance;

    /**
     * Initializes a bank account with an account number and starting balance.
     *
     * @param accountNumber The unique identifier for the bank account.
     * @param balance The initial account balance.
     */
    public void initializeAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Retrieves the account number.
     *
     * @return The account number as a String.
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Retrieves the current account balance.
     *
     * @return The current balance as a double.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Withdraws a specified amount from the account if sufficient funds are available.
     *
     * @param amount The amount to withdraw.
     * @throws InsufficientFundsException if there are insufficient funds.
     */
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        }
        balance -= amount;
        System.out.println("Withdrawal Successful. Remaining Balance: " + balance);
    }

    /**
     * Displays account details, including the account number and balance.
     */
    public void display() {
        System.out.println("Account Number: " + getAccountNumber() + " | Balance: " + getBalance());
    }
}

/**
 * The entry point of the program, allowing the user to interact with a bank account.
 */
public class Javadoc {
    /**
     * Main method to execute the program.
     * Handles user input and exceptions gracefully.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            BankAccount account = new BankAccount();

            System.out.println("Enter Bank Account Number:");
            String accountNumber = scanner.nextLine();

            System.out.println("Enter Initial Account Balance:");
            double balance = scanner.nextDouble();
            account.initializeAccount(accountNumber, balance);

            System.out.println("Enter Withdrawal Amount:");
            double withdrawalAmount = scanner.nextDouble();

            account.withdraw(withdrawalAmount);
            account.display();

        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred.");
        }
    }
}
