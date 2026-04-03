package Task6part1;

public class Book {
    // Private Fields
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor A: Takes title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Constructor B: Takes title only
    public Book(String title) {
        this.title = title;
        this.author = "Unknown Author";
        this.isAvailable = true;
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return isAvailable; }

    // Borrow Method
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Status: You have successfully borrowed '" + title + "'.");
        } else {
            System.out.println("Error: '" + title + "' is currently not available.");
        }
    }

    // Return Method
    public void returnBook() {
        isAvailable = true;
        System.out.println("Status: '" + title + "' has been returned.");
    }
}