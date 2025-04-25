package Constructor;

class Employee{
    private String name;
    private  final int salary;

    Employee(){
        this("Junaid");
    }
    Employee(String name){
        this(name,5000);
    }
    Employee(String name ,int salary){
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println(name+" "+salary);
    }
}
public class ChainConst2 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.display();
        Employee e2 = new Employee("Mannan");
        e2.display();
        Employee e3  = new Employee("Noman",50000);
        e3.display();
    }
}
