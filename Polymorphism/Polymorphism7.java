package Polymorphism;

//Q7. Abstract Class with Override
//Create an abstract class Appliance with an abstract method turnOn().
//Create Fan and WashingMachine subclasses and override the method.
//Use an Appliance reference to store different objects and call turnOn().

abstract class Appliance{
    abstract void turnOn();
}
class Fan extends Appliance{
    @Override
    void turnOn(){
        System.out.println("Yes");
    }
}
class WashingMachine extends Appliance{
    @Override
    void turnOn(){
        System.out.println("No");
    }
}
public class Polymorphism7 {
    public static void main(String[] args) {
        Appliance a1 = new Fan();
        Appliance a2 =new WashingMachine();

        a1.turnOn();
        a2.turnOn();
    }
}
