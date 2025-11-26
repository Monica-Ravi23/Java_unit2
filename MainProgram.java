// A complete program demonstrating core Object-Oriented concepts in Java
class Student {
    // Instance Variables: These belong to each individual object
    String name;
    int age;
    double marks;

    // Static Variable: Shared by all objects of this class
    static String collegeName = "Christ University";

    // Default Constructor: Initializes object with default values
    Student() {
        name = "Unknown";
        age = 18;
        marks = 0.0;
    }

    // Parameterized Constructor: Initializes object with custom values
    Student(String s, int a, double m) {
        name = s;
        age = a;
        marks = m;
    }

    // Method to display student details
    // (Demonstrates accessing instance and static variables, and method nesting)
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("College: " + collegeName);
        checkResult(); // Nested Method Call
    }

    // Nested Method: Called inside another method to break down logic
    void checkResult() {
        if (marks >= 50) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
    }

    // Static Method: Belongs to the class, can be accessed without creating objects
    static void updateCollege(String newCollege) {
        collegeName = newCollege;
    }
}

public class MainProgram {
    public static void main(String[] args) {
        // Creating object using default constructor
        Student st1 = new Student();

        // Creating object using parameterized constructor
        Student st2 = new Student("Moni", 22, 88.5);

        // Accessing static method to update a shared variable
        Student.updateCollege("School of Engineering and Technology");

        // Calling methods using objects
        System.out.println("Student 1 Information:");
        st1.displayDetails();

        System.out.println();

        System.out.println("Student 2 Information:");
        st2.displayDetails();
    }
}
