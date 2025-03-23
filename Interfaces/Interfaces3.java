package Interfaces;

interface Payment{
   void  processPayment(double amount);
}
class CreditcardPayment implements Payment{
    @Override
    public void processPayment(double amount){
        System.out.println(" Processing credit card payment of $amount "+amount);
    }
}
class PaypalPayment implements Payment{
    @Override
    public void processPayment(double amount){
        System.out.println(" Processing PayPal payment of $amount " + amount);
    }
}
public class Interfaces3 {
    public static void main(String[] args) {
        Payment c1 = new CreditcardPayment();
        Payment p1 = new PaypalPayment();

        c1.processPayment(5000);
        p1.processPayment(5000);
    }
}
