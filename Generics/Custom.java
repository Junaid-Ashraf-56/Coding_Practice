package Generics;
import java.util.*;

// Custom class for demonstration
class Book {
    String title;
    int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book: " + title + ", Pages: " + pages;
    }
}

public class Custom {

    // 🔶 Generic method
    public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        // Integer list
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        System.out.println("Integer List:");
        printList(numbers);

        // String list
        List<String> names = Arrays.asList("Junaid", "Ali", "Sara");
        System.out.println("\nString List:");
        printList(names);

        // Book list
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Basics", 250));
        books.add(new Book("OOP in Depth", 300));
        System.out.println("\nBook List:");
        printList(books);
    }
}
