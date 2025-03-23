package Interfaces;

interface BankAccount{

    void deposit(double amount);
    void withdraw(double amount);
    void  getBalance(double amount);

}
class SavingsAccount implements BankAccount{
    private final double interestRate;
    double initial_amount ; //Suppose initial ammount

    SavingsAccount(double interestRate,double initial_amount){
        this.interestRate = interestRate;
        this.initial_amount = initial_amount;
    }
    @Override
    public void deposit(double amount){
        if (amount>0){
            initial_amount+=amount;
        }
        else {
            System.out.println("Invalid entry");
        }
    }
    @Override
    public void withdraw(double amount) {
        if (amount<initial_amount&&amount>0){
            initial_amount+=amount;
        }
        else {
            System.out.println("Invalid entry");
        }
    }
    @Override
    public void getBalance(double amount){
        System.out.println(initial_amount);
    }
}

class CheckingAccount implements BankAccount{
    double initial_amount ; //Suppose initial ammount

    CheckingAccount(double initial_amount){
        this.initial_amount = initial_amount;
    }
    @Override
    public void deposit(double amount){
        if (amount>0){
            initial_amount+=amount;
        }
        else {
            System.out.println("Invalid entry");
        }
    }
    @Override
    public void withdraw(double amount) {
        if (amount<initial_amount&&amount>0){
            initial_amount+=amount;
        }
        else {
            System.out.println("Invalid entry");
        }
    }
    @Override
    public void getBalance(double amount){
        System.out.println(initial_amount);
    }
}
public class Interface2 {
    public static void main(String[] args) {
        CheckingAccount c1 = new CheckingAccount(50000);
        c1.deposit(5000);
        c1.getBalance(5000);
        c1.withdraw(5000);
        c1.getBalance(5000);

        SavingsAccount s1 = new SavingsAccount(3.4,500000);
        s1.deposit(5000);
        s1.getBalance(5000);
        s1.withdraw(5000);
        s1.getBalance(5000);
    }
}
