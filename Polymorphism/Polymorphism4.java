package Polymorphism;

//Q4. Dynamic Method Dispatch with Casting
//Create a class Vehicle with method run(), and subclass Car with overridden run().
//Use a Vehicle reference for a Car object and demonstrate upcasting and down casting.

class Vehicle{
    public void run(){
        System.out.println("Vehicle start");
    }
}
class Car extends Vehicle{
    @Override
    public void run(){
        System.out.println("Car start");
    }
}
public class Polymorphism4 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.run();

        //down casting

    }
}
