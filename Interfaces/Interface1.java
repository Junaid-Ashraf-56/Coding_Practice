package Interfaces;

interface Animal{
    void MakeSound();
}
interface Walkable{
    void walk();
}
class Dog implements Animal,Walkable{

    @Override
    public void MakeSound(){
        System.out.println("Bao Bao");
    }

    @Override
    public void walk(){
        System.out.println("tur tur");
    }
}
public class Interface1 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.MakeSound();
        d1.walk();
    }
}
