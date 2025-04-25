package Constructor;

class Book{
 String title;
 String author;
 int price;
 Book(String title,String author,int price){
     this.title = title;
     this.author = author;
     this.price = price;
 }
 Book(Book other) {
    this.title = other.title;
    this.author = other.author;
    this.price = other.price;
 }
 void display(){
     System.out.println(title+" "+ author+" "+price);
 }
}
public class CopyConst1 {
    public static void main(String[] args) {
        Book b1 = new Book("Hello","Hello",500);
        b1.display();
        Book b2 = new Book(b1);
        b2.display();
    }
}
