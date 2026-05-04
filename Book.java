public class Book extends Media {
    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public void displayDetails() {
        // Use title directly because it is protected in Media
        System.out.println("Book Title: " + title); 
        System.out.println("Author: " + author);
    }
}