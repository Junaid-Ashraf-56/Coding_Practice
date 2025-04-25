package Constructor;

class Mobile{
    private final String brand;
    private final int price;
    Mobile(String brand,int price){
        this.brand = brand;
        this.price = price;
    }
    Mobile(Mobile mobile){
        this.brand = mobile.brand;
        this.price = mobile.price;
    }
    void display(){
        System.out.println(brand+" "+price);
    }
}
public class CopyConst2 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Apple",5000);
        m1.display();
        Mobile m2 = new Mobile(m1);
        m2.display();
    }
}
