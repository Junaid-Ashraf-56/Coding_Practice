package Interfaces;

interface ATM{
    void withdraw(double balance);
    void deposit(double balance);
    void checkBalance();
}
abstract class BaseATM implements ATM {
    private double totalBalance;
    private int dailyWithdrawals;
    BaseATM() { this.totalBalance = 404; }
    public void setTotalBalance(double totalBalance){
        this.totalBalance = totalBalance;
    }
    public double getTotalBalance(){
        return totalBalance;
    }
    public int getDailyWithdrawals() {
        return dailyWithdrawals;
    }
    public void incrementWithdrawals() {
        dailyWithdrawals++;
    }
    @Override
    public void withdraw(double balance) {
        if (balance>0&&balance<=totalBalance){
            incrementWithdrawals();
            totalBalance-=balance;
            System.out.println("Withdrawal successful! Remaining balance: " + getTotalBalance());
        }
        else {
            System.out.println("Invalid entry");
        }
    }
    @Override
    public void deposit(double balance) {
        if (balance>0){
            totalBalance+=balance;
            System.out.println("Deposit successful! New balance: " + totalBalance);
        }
        else {
            System.out.println("Invalid entry");
        }
    }
    @Override
    public void checkBalance() {
        System.out.println("Total Balance "+this.totalBalance);
    }
}

class HBL_ATM extends BaseATM{
    private static final int Withdrawal = 3;

    HBL_ATM(){
         super();
     }
    @Override
    public void withdraw(double balance) {
        if (getDailyWithdrawals() >= Withdrawal) {
            System.out.println("Withdrawal limit reached! Only 3 withdrawals allowed per day.");
        } else {
            super.withdraw(balance);
        }
    }
}
class MCB_ATM extends BaseATM{
    private static final double Tax = 0.02;
    MCB_ATM(){
        super();
    }
    @Override
    public void withdraw(double balance) {
        double tax = balance * Tax;
        double totalAmount = balance + tax;

        if (totalAmount > getTotalBalance()) {
            System.out.println("Insufficient balance after tax deduction.");
        } else {
            setTotalBalance(getTotalBalance() - totalAmount);
            System.out.println("Withdrawal successful! 2% tax deducted. Remaining balance: " + getTotalBalance());
        }
    }
}
public class Interfaces4 {
    public static void main(String[] args) {
        BaseATM a1 = new HBL_ATM();
        a1.setTotalBalance(50000);
        a1.deposit(5000);
        a1.withdraw(500);
        a1.withdraw(500);
        a1.withdraw(500);
        a1.withdraw(500);
        a1.checkBalance();

        BaseATM a2 = new MCB_ATM();
        a2.setTotalBalance(50000);
        a2.deposit(25000);
        a2.withdraw(5000);
        a2.checkBalance();
    }
}
