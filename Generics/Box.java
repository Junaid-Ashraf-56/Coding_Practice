package Generics;

class Hello<T>{
    T value;
    T value2;
    Hello(){}

    public Hello(T value) {
        this.value = value;
    }

    public Hello(T value, T value2) {
        this.value = value;
        this.value2 = value2;
    }

    public T getValue() {return value;}
    public void setValue(T value) {this.value = value;}
}
class Student{
    private String name ;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getRollNo() {return rollNo;}
    public void setRollNo(int rollNo) {this.rollNo = rollNo;}
    @Override
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo;
    }

}
public class Box {
    public static void main(String[] args) {
        Hello<Integer> hello = new Hello<>();
        hello.setValue(50);
        System.out.println(hello.getValue());

        Hello<String> hello1 = new Hello<>();
        hello1.setValue("hello");
        System.out.println(hello1.getValue());

        Hello<Student> hello2 = new Hello<>();
        hello2.setValue(new Student("Junaid",58));
        hello2.toString();

    }

}
