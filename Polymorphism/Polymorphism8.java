package Polymorphism;

//Q8. Bank System with Polymorphism
//Create a superclass Account with getInterestRate() method.
//Subclasses: SavingsAccount, FixedDepositAccount override getInterestRate().
//Print the interest rate using a single method that takes Account reference.

class Account {
    public void getInterestRate(){
        System.out.println("Get interest rate");
    }
}
class SavingAccount extends Account{
    @Override
    public void getInterestRate(){
        System.out.println("Interest Rate on Saving Account is 5%");
    }
}
class FixedDepositAccount extends Account{
    @Override
    public void getInterestRate(){
        System.out.println("Interest Rate on Fixed Deposit Account is 10%");
    }
}
public class Polymorphism8 {
    public static void main(String[] args) {
        Account a1 = new SavingAccount();
        Account a2 = new FixedDepositAccount();

        a1.getInterestRate();
        a2.getInterestRate();
    }
}
