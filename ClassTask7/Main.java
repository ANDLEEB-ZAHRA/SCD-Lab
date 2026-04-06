package ClassTask7;

public class Main {
    public static void main(String[] args) {
        

        // Student
        Student s1 = new Student("Andleeb Zahra", 041, "Software Engineering");
        System.out.println("--- Student Details ---");
        s1.displayInfo();
        System.out.println();

        // 3. Teacher ka object
        Teacher t1 = new Teacher("Sir Seemab", 303, "Advanced Java");
        System.out.println("--- Teacher Details ---");
        t1.displayInfo();
        t1.teach(); 
        System.out.println();   
        //4.HOD
    
      HOD myHOD = new HOD("Prof:Adil Butt", "Computer Science", "Computer Science Department");

        System.out.println("--- HOD Details ---");
        myHOD.displayInfo();
        myHOD.manageDepartment();
    }
}