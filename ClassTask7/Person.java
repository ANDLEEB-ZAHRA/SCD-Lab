package ClassTask7;

public class Person {
    // Common Attributes
     String name;
     int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
   
    }

    // Method to display person's name
    public void Name() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);

    }
}

