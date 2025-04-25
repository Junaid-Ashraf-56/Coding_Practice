package Constructor;
class Product{
    private final String name;
    private final int price;
    private final String quality;

    Product(){
        this("Junaid");
    }
    Product(String name){
        this(name,5000);
    }
    Product(String name,int price){
        this(name,price,"Good");
    }
    Product(String name ,int price,String quality){
        this.name = name;
        this.price = price;
        this.quality = quality;
    }
    void display(){
        System.out.println(name+" "+price+" "+quality);
    }
}
public class ChainConst3 {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.display();
        Product p2 = new Product("Asad");
        p2.display();
        Product p3 = new Product("Mohsin",5000);
        p3.display();
        Product p4 = new Product("Adeel ",5000,"Bad");
        p4.display();
    }
}
