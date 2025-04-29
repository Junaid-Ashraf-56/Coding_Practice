package Polymorphism;

class Animal1{
    public void sound(){
        System.out.println("Animal Sound");
    }
}
class Dog1 extends Animal1{
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }


    public void hi(){
        System.out.println("Dog");
    }
}
public class TestPoly {
    public static void main(String[] args) {
        Animal1 a1 = new Dog1();
        a1.sound();

        if (a1 instanceof Dog1){
            Dog1 d = (Dog1) a1;
            d.hi();
        }
    }
}
