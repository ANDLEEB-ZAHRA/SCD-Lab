package ClassTask7;

public class HOD extends Teacher {
    String department;

    public HOD(String name, String subject, String dept) {
      
        super(name, 0, subject); // Call Teacher's constructor with a default ID
        this.department = dept;
    }

    public void manageDepartment() {
        System.out.println("HOD " + name + " is managing the " + department);
    }

    @Override
    public void displayInfo() {   
        super.displayInfo(); 
        System.out.println("Department: " + department);
    }
}