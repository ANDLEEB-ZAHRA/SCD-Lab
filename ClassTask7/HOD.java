package ClassTask7;

public class HOD extends Teacher {
    String department;

    public HOD(String name, String subject, String dept) {
      
        super(name, 0, subject); // Call Teacher's constructor with a default ID
        this.department = dept;
    }

    public void manageDepartment() {
        // 'name' variable Teacher class mein 'protected' ya 'public' hona chahiye
        System.out.println("HOD " + name + " is managing the " + department);
    }

    @Override
    public void displayInfo() {
        // Teacher class ka info print karne ke liye sahi method call karein
        super.displayInfo(); 
        System.out.println("Department: " + department);
    }
}