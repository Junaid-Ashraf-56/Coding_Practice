package Agregation_Composition;
import java.util.ArrayList;
import java.util.List;

// Kitab Class
class Kitab {
    private final String title;
    public Kitab(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}
// Library Class using Composition
class Library {
    private final  List<Kitab> books; // Composition

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Kitab book) {
        books.add(book);
    }

    public void showBooks() {
        for (Kitab book : books) {
            System.out.println(book.getTitle());
        }
    }
    }

    // Main Class to test
    public class Composition1 {
        public static void main(String[] args) {
            Library library = new Library();
            library.addBook(new Kitab("Java Programming"));
            library.addBook(new Kitab("Data Structures"));
            library.showBooks(); // Output: Java Programming, Data Structures
        }
    }

    