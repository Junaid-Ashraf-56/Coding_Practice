import java.time.Year;

class Book1 {
    public String title;
    public String author;
    public double price;
    public Year publicationyear;

    public Book1(){
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
        this.publicationyear = Year.now();
    }

    public Book1(String a, String b){
        title = a;
        author = b;
    }
    public Book1(String a, String b, double c){
        title = a;
        author = b;
        price = c;
    }
    public Book1(String a, String b, double c , int d){
        title = a;
        author = b;
        price = c;
        publicationyear = Year.of(d);
    }
    public void display(){
        System.out.println(title+"  "+author+"  "+price+"  "+publicationyear);
    }
}
public class Assign {
    public static void main(String[] args) {
        Book1 b1 = new Book1();
        b1.display();
        Book1 b2 = new Book1("Atomic Habits","James Clear");
        b2.display();
        Book1 b3 = new Book1("hyper Focus","Chris Baily",500);
        b3.display();
        Book1 b4 = new Book1("Nortge","Brad Kessler",500,2008);
        b4.display();
    }
}
