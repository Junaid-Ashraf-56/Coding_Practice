package Abstract;

abstract class Employee{
    public String Name;
    public int Id;
    abstract int CalculateSalary();


    public void EmployeeDetail(){
        System.out.println("Name "+ Name+" ID "+Id);
    }
    public void displaySalary(){
        System.out.println("The Salary is $"+CalculateSalary());
    }

}
class FullTimeEmployee extends Employee{

    FullTimeEmployee(int Id,String Name){
        this.Id = Id;
        this.Name = Name;
    }
    @Override
    int CalculateSalary(){
      return 50000;
    }
}
class PartTimeemployee extends Employee{
    int hourwage;
    int hour;
    PartTimeemployee(int hourwage , int hour,int  Id,String Name){
        this.hourwage = hourwage;
        this.hour = hour;
        this.Id = Id;
        this.Name = Name;
    }
    @Override
    int CalculateSalary(){
        return hour*hourwage;
    }
}
public class Abstract2 {
    public static void main(String[] args) {
        FullTimeEmployee f1 = new FullTimeEmployee(13,"Junaid");
        PartTimeemployee p1 = new PartTimeemployee(5,3,123,"Asad");

        f1.EmployeeDetail();
        f1.displaySalary();
        p1.EmployeeDetail();
        p1.displaySalary();
    }
}
