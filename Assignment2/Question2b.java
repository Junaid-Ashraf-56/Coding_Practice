package Assignment2;
// Base class representing a general library user
class LibraryUser {
    protected int userID;
    protected String name;
    protected String email;

    // Constructor for initializing common attributes
    public LibraryUser(int userID, String name, String email) {
        this.userID = userID;
        this.name = name;
        this.email = email;
    }
    public void displayDetails() {
        System.out.println("User ID: " + userID);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

// Derived class representing a Librarian
class Librarian extends LibraryUser {
    private final String employeeID;
    private final String workShift;

    // Constructor for Librarian
    public Librarian(int userID, String name, String email, String employeeID, String workShift) {
        super(userID, name, email);
        this.employeeID = employeeID;
        this.workShift = workShift;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Work Shift: " + workShift);
        System.out.println("-----------------------------");
    }
}

// Derived class representing a Library Member
class Member extends LibraryUser {
    private final String membershipID;
    private final int borrowedBooksCount;

    // Constructor for Member
    public Member(int userID, String name, String email, String membershipID, int borrowedBooksCount) {
        super(userID, name, email);
        this.membershipID = membershipID;
        this.borrowedBooksCount = borrowedBooksCount;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Membership ID: " + membershipID);
        System.out.println("Borrowed Books Count: " + borrowedBooksCount);
        System.out.println("-----------------------------");
    }
}

// Derived class representing a Guest
class Guest extends LibraryUser {
    private final String visitPurpose;

    // Constructor for Guest
    public Guest(int userID, String name, String email, String visitPurpose) {
        super(userID, name, email);
        this.visitPurpose = visitPurpose;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Visit Purpose: " + visitPurpose);
        System.out.println("-----------------------------");
    }
}

public class Question2b {
    public static void main(String[] ignoredArgs) {
        Librarian librarian = new Librarian(101, "Junaid Ashraf", "Junaid@gmail.com", "123", "Morning");
        Member member = new Member(102, "Asad", "asad@gmail.com", "0123", 5);
        Guest guest = new Guest(103, "Noman", "Noman@gmail.com", "Research");
        librarian.displayDetails();
        member.displayDetails();
        guest.displayDetails();
    }
}
