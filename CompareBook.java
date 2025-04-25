import java.util.Scanner;

class Book4 {
    // Encapsulated Data Members
    private String author;
    private String[] chapterNames;
    private int chapterCount; // To track the number of chapters

    // No-Argument Constructor
    public Book4() {
        this.author = "Unknown";
        this.chapterNames = new String[100]; // Fixed size
        this.chapterCount = 0;
    }

    // Parameterized Constructor
    public Book4(String author, String[] chapterNames) {
        this.author = author;
        this.chapterNames = chapterNames.clone(); // Deep copy
        this.chapterCount = chapterNames.length;
    }

    // Setter Methods
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setChapters(String[] chapters) {
        this.chapterNames = chapters.clone(); // Deep copy
        this.chapterCount = chapters.length;
    }

    // Getter Methods
    public String getAuthor() {
        return author;
    }

    public int getChapterCount() {
        return chapterCount;
    }

    // Compare Books by Author
    public boolean compareBooks(Book4 otherBook) {
        return this.author.equalsIgnoreCase(otherBook.getAuthor());
    }

    // Compare Chapter Names and Return the Book4 with More Chapters
    public Book4 compareChapterNames(Book4 otherBook) {
        return (this.chapterCount > otherBook.getChapterCount()) ? this : otherBook;
    }

    // Display Book4 Details
    public void display() {
        System.out.println("\nBook Details:");
        System.out.println("Author: " + author);
        System.out.println("Number of Chapters: " + chapterCount);
        System.out.print("Chapters: ");
        for (int i = 0; i < chapterCount; i++) {
            System.out.print(chapterNames[i] + ", ");
        }
        System.out.println();
    }
}

// Runner Class (Main Class)
public class CompareBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First Book4 (Using No-Argument Constructor and Setters)
        Book4 book1 = new Book4();
        System.out.print("Enter author for Book4 1: ");
        book1.setAuthor(scanner.nextLine());

        System.out.print("Enter number of chapters for Book4 1: ");
        int chapters1Count = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String[] chapters1 = new String[chapters1Count];
        for (int i = 0; i < chapters1Count; i++) {
            System.out.print("Enter chapter " + (i + 1) + " for Book4 1: ");
            chapters1[i] = scanner.nextLine();
        }
        book1.setChapters(chapters1);

        // Second Book4 (Using Parameterized Constructor)
        System.out.print("\nEnter author for Book4 2: ");
        String author2 = scanner.nextLine();

        System.out.print("Enter number of chapters for Book4 2: ");
        int chapters2Count = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String[] chapters2 = new String[chapters2Count];
        for (int i = 0; i < chapters2Count; i++) {
            System.out.print("Enter chapter " + (i + 1) + " for Book4 2: ");
            chapters2[i] = scanner.nextLine();
        }
        Book4 book2 = new Book4(author2, chapters2);

        // Display Book4 Details
        book1.display();
        book2.display();

        // Compare Books by Author
        if (book1.compareBooks(book2)) {
            System.out.println("\nBoth books are written by the same author.");
        } else {
            System.out.println("\nThe books are written by different authors.");
        }

        // Compare Books by Chapter Count
        Book4 largerBook = book1.compareChapterNames(book2);
        System.out.println("\nThe book with more chapters is written by: " + largerBook.getAuthor());

        scanner.close();
    }
}
