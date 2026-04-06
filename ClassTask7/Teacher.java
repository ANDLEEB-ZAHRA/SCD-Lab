package ClassTask7;

public class Teacher extends Person {
    // Additional Attributes
    String subject;

public void teach(){
    System.out.println("Teaching " + subject);
}

    // Constructor
    public Teacher(String name, int id, String subject) {
        super(name, id); // Call the constructor of the Person class
        this.subject = subject;
    }
    // Method to display teacher's information
    public void displayInfo() {
        super.Name(); // Call the method to display name and ID from Person class
        System.out.println("Subject: " + subject);
    }
    
}