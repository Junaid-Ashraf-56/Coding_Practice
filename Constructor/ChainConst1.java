package Constructor;

class Student{
    private final String name;
    Student(){
        this("Junaid");
        System.out.println("Default constructor");
    }
    Student(String name){
        this.name = name;
    }
    void display(){
        System.out.println(name);
    }
}
public class ChainConst1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
