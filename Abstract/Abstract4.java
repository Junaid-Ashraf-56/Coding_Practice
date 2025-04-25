package Abstract;

//Q3: Abstract Bank System
//Create an abstract class BankAccount with
//Abstract method: calculateInterest()
//Data members: accountNumber, balance
//Then, create two subclasses:
//SavingsAccount – interest rate = 5%
//        CurrentAccount – interest rate = 3%
//        Calculate interest for both and print details.

abstract class BankAccount{
    public String accountNumber;
    public double balance;
    BankAccount(String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    protected abstract double calculateInterset();
    public void display(){
        System.out.println("Account NUmber "+accountNumber);
        System.out.println("Balance "+balance);
    }
}
class SavingAccount extends BankAccount{
    double interset;
    SavingAccount(String accountNumber,double balance){
        super(accountNumber,balance);
    }
    @Override
    public double calculateInterset(){
        interset = balance * ((double) 5 /100);
        return interset;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Interset "+ calculateInterset());
    }
}
class CurrentAccount extends BankAccount{
    double interset;
    CurrentAccount(String accountNumber,double balance){
        super(accountNumber,balance);
    }
    @Override
    public double calculateInterset(){
        interset = balance * ((double)3/100);
        return interset;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Interset "+calculateInterset());
    }
}
public class Abstract4 {
    public static void main(String[] args) {
        BankAccount b1 =  new CurrentAccount("123",5000);
        BankAccount b2 = new SavingAccount("1234",10000);

        b1.display();
        b2.display();
    }
}
