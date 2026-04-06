package ClassTask7;

public class Student extends Person{
    // Additional Attributes
    String major;

    // Constructor
    public Student(String name, int id, String major) {
        super(name, id); // Call the constructor of the Person class
        this.major = major;
    }

    // Method to display student's information
    public void displayInfo() {
        super.Name(); // Call the method to display name and ID from Person class
        System.out.println("Major: " + major);
    }

}
