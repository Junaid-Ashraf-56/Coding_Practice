package Polymorphism;

//Q6. Overridden toString() and equals()
//Create class Book and override toString() and equals().
//Create two Book objects with the same data, and compare using .equals() + print using System.out.println().

class Book{
    private int bookId;
    private String bookName;
    Book(int bookId,String bookName){
        this.bookId= bookId;
        this.bookName=bookName;
    }
    public Book() {}

    public String getBookName() {return bookName;}
    public void setBookName(String bookName) {this.bookName = bookName;}
    public int getBookId() {return bookId;}
    public void setBookId(int bookId) {this.bookId = bookId;}

    @Override
    public String toString(){
        return "Book Name"+this.getBookName()+"Book Id"+this.getBookId();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return this.bookName.equals(book.bookName);
    }

}
public class Polymorphism6 {
    public static void main(String[] args) {
      Book b1 = new Book();
      b1.setBookId(123);
      b1.setBookName("Atomic Habits");
      Book b2 = new Book(123,"Atomic Habits");
        System.out.println("Both Book names are equal? "+b1.equals(b2));

    }
}
