package Agregation_Composition;
// Class for Engine

class Engine {
    public void start() {
        System.out.println("Engine started.");
    }
}
// Class for Car that uses Engine
class Car {
    private final Engine engine; // Composition
    public Car() {
        this.engine = new Engine(); // Car has an Engine
    }
    public void startCar() {
        engine.start(); // Using Engine's start method
        System.out.println("Car is running.");
    }
}
// Main class to test
public class Composition {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startCar(); // Output: Engine started. Car is running.
    }
}
