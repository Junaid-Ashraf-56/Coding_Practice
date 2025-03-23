package Agregation_Composition;

import java.util.Arrays;
import java.util.List;

class Book {
    String title;
    String author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

}
class library {
    private final List<Book> books;
    library(List<Book> books) {
        this.books = books;
    }
    public void showBooks() {
        for (Book book : books) {
            System.out.println(book.title + " by " + book.author);
        }
    }
}
public class Aggregation {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        List<Book> books = Arrays.asList(book1, book2);
        library library = new library(books);
        library.showBooks();
    }
}