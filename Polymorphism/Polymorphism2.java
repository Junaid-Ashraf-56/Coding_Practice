package Polymorphism;

//Q2. Overriding + Constructor Flow
// Creates a class Person with method describe(). Create a subclass Employee that overrides this method.
//Print output from both classes and observe which describe() is called based on object type and reference type.
class Person{
    public void describe(){
        System.out.println("Person could be any body");
    }
}
class Employee extends Person{
    @Override
    public void describe(){
        System.out.println("Employee");
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Employee();

        p1.describe();
        p2.describe();
    }
}
