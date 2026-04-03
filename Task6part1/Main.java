package Task6part1;

public class Main {
    public static void main(String[] args) {
        // Different Book Names and Authors
        Book book1 = new Book("Clean Code", "Robert C. Martin");
        Book book2 = new Book("Digital Fortress");

        System.out.println("--- Library Records ---");
        
        // Printing Book 1 Info
        System.out.println("Book 1 Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Available: " + book1.isAvailable());

        // Printing Book 2 Info
        System.out.println("\nBook 2 Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Available: " + book2.isAvailable());

        System.out.println("\n--- Processing Transactions ---");
        book1.borrowBook(); // Successful borrow
        book1.borrowBook(); // Should show error
        
        System.out.println("\n--- Final Status ---");
        System.out.println(book1.getTitle() + " Available: " + book1.isAvailable());
    }
}