package Assignment2;
class Employee {
    private final String name;
    private final int age;

    // Constructor using 'this' to resolve instance variable conflict
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Using 'this' to call another constructor
    public Employee() {
        this("404", 404);
    }

    // Using 'this' to return the current object
    public Employee getEmployee() {
        return this;
    }

    // Using 'this' to invoke another method
    public void showDetails() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Age: " + this.age);
    }
}
public class Question1 {
            public static void main(String[] args) {
                Employee emp1 = new Employee("Junaid", 19);
                emp1.showDetails();

                Employee emp2 = new Employee();
                emp2.showDetails();
        }
}
