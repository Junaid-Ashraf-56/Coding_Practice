package Abstract;

abstract class Vehicle{
     String Brand;
     String Model;
     int Year;

    Vehicle(String Brand,String Model,int Year){
        this.Brand = Brand;
        this.Model = Model;
        this.Year = Year;
    }
    abstract void StartEngine();
    public void display(){
        System.out.println("Brand "+Brand+" Model "+Model+" Year "+Year);
        System.out.println("Start Engine");
    }
}
class Car extends Vehicle{
    Car(String Brand,String Model,int Year){
        super(Brand,Model,Year);
    }
    @Override
    void StartEngine(){
        super.display();
    }
}
class Bike extends Vehicle{
    Bike(String Brand,String Model,int Year){
        super(Brand,Model,Year);
    }
    @Override
    void StartEngine(){
        super.display();
    }
}
public class Abstract3 {
    public static void main(String[] args) {
        Car c1 = new Car("BMW","M4",2018);
        Bike b1 = new Bike("BMW","xr1000",2025);

        c1.StartEngine();
        b1.StartEngine();
    }
}
