public class Magazine extends Media {
    private int issueNumber;

    // This constructor MUST take a String and an int to work with your Main
    public Magazine(String title, int issueNumber) {
        super(title); // Passes the title to the Media parent class
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
    }
}