package Task6part1;
public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor A: Takes title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Default to true
    }

    // Constructor B: Takes title only
    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.isAvailable = true; // Default to true
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Method to borrow the book
     public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Success: You have borrowed '" + title + "'.");
        } else {
            System.out.println("Error: '" + title + "' is already borrowed and currently unavailable.");
        }
    }

    // Method to return the book
public void returnBook() {
    if (isAvailable == false) { 
        System.out.println("Success: '" + title + "' has been returned.");
        isAvailable = true;
    } else {
        System.out.println("Error: '" + title + "' was not borrowed, so it cannot be returned.");
    }
}
}
