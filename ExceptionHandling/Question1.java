package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class Handle{
    void Division(int a ,int b){
        try{
            int result = a/b;
            System.out.println(" Result "+result);
       }catch (ArithmeticException e){
            System.out.println(" Can't divide by 0");
        }finally {
            System.out.println("Operation Completed");
        }
    }
}
public class Question1 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        try{
            System.out.println("Enter First value");
            int a = abc.nextInt();
            System.out.println("Enter Second value");
            int b = abc.nextInt();

            Handle h1 = new Handle();
            h1.Division(a,b);
        }catch (InputMismatchException e){
            System.out.println("Please enter integer");
        }finally {
            System.out.println("Operation Completed");
        }
    }
}
