package Polymorphism;

//Q1. Method Overriding with Superclass Reference
//to Create a class Animal with a method makeSound(). Create two subclasses Dog and Cat that override this method.
//In main(), create an array of Animal references storing Dog and Cat objects, and call makeSound().
class Animal {
    public void makeSound(){
        System.out.println("Animal make sound");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow");
    }
}
public class Polymorphism1 {
    public static void main(String[] args) {
        Animal D1 = new Dog();
        Animal C1 = new Cat();
        D1.makeSound();
        C1.makeSound();
    }
}
