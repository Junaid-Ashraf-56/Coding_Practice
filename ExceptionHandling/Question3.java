package ExceptionHandling;

import java.util.Scanner;

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}
class BankAccount{
    String accountNumber;
    double balance;
    public void setBankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return  balance;
    }
    void withdraw(double amount) throws InsufficientFundsException {
      if (amount>balance){
          throw new InsufficientFundsException("Insufficient Fund");
      }
      else {
          balance -= amount;
          System.out.println("Withdrawal Successful");
      }
    }
    public void display(){
        System.out.println("Account Number  "+ getAccountNumber()+"  Balance "+ getBalance());
    }
}
public class Question3 {
    public static void main(String[] args){
        try {
            Scanner abc = new Scanner(System.in);
            BankAccount b1 = new BankAccount();
            System.out.println("Enter Bank Account");
            String accountNumber = abc.nextLine();
            System.out.println("Enter Account Balance");
            double balance = abc.nextDouble();
            b1.setBankAccount(accountNumber, balance);

            System.out.println("Enter withdrawal amount");
            double withdraw = abc.nextDouble();
            if (withdraw<0){
                throw new Exception("Invalid entry");
            }
            b1.withdraw(withdraw);

            b1.display();
        }catch (InsufficientFundsException e){
            System.out.println("Exception "+ e.getMessage());
        }catch (Exception e){
            System.out.println("Invalid input please enter valid number");
        }
    }
}