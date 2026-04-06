package Task6part1;
public class Main {
    public static void main(String[] args) {
        // 1. Create two book objects using both constructors
        Book book1 = new Book("Clean Code", "Robert C. Martin");
        Book book2 = new Book("The Mystery of Java");

        System.out.println("--- Library System ---");

        // 2. Attempt to borrow the first book twice
        System.out.println("\nAction: Borrowing first book...");
        book1.borrowBook(); 

        System.out.println("Action: Borrowing first book again...");
        book1.borrowBook(); // Should show error

        // 3. Return the book and try borrowing it again
        System.out.println("\nAction: Returning first book...");
        book1.returnBook();

        System.out.println("Action: Borrowing first book again...");
        book1.borrowBook();

        // 4. Print the status of both books
        System.out.println("\n--- Final Status ---");
        printBookStatus(book1);
        printBookStatus(book2);
    }

    // Helper method to print status
    public static void printBookStatus(Book book) {
        String status = book.isAvailable() ? "Available" : "Borrowed";
        System.out.println("Title: " + book.getTitle() + 
                           " | Author: " + book.getAuthor() + 
                           " | Status: " + status);
    }
}