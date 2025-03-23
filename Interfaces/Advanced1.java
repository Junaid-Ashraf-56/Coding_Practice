package Interfaces;

abstract class SmartDevice{
    private final String Brand;
    private final String Model;
    abstract void ConnecttoWifi();

    SmartDevice(String Brand,String Model){
        this.Brand = Brand;
        this.Model = Model;
    }
    public void display(){
        System.out.println(Brand+ " "+Model);
    }
}
interface Rechargeable{
    void chargeBattery();
}
class SmartPhone extends SmartDevice implements Rechargeable{
  SmartPhone(String Brand,String Model){
       super(Brand,Model);
  }
  @Override
  void ConnecttoWifi(){
      System.out.println("It is connected to wifi");
  }
  @Override
    public void chargeBattery(){
      System.out.println("Yes it charge battery");
  }
}
class SmartWatch extends SmartDevice implements Rechargeable{
    SmartWatch(String Brand,String Model){
        super(Brand,Model);
    }
    @Override
    void ConnecttoWifi(){
        System.out.println("It is not connected to wifi");
    }
    @Override
    public void chargeBattery(){
        System.out.println("No it charge battery");
    }
}
public class Advanced1 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("Iphone","2022");
        SmartWatch w1 = new SmartWatch("Sam","2022");

        s1.display();
        s1.ConnecttoWifi();
        s1.chargeBattery();

        w1.display();
        w1.ConnecttoWifi();
        w1.chargeBattery();
    }
}
