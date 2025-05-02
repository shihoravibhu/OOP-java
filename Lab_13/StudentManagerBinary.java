import java.io.*;
import java.util.*;

class Student {
    String name;
    int age;
    String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

public class StudentManagerBinary {

    // Save students to binary file
    public static void saveStudents(List<Student> students, String filename) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeInt(students.size()); // write number of students

            for (Student s : students) {
                dos.writeUTF(s.name);
                dos.writeInt(s.age);
                dos.writeUTF(s.grade);
            }

            System.out.println("Students saved to binary file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Load students from binary file
    public static List<Student> loadStudents(String filename) {
        List<Student> students = new ArrayList<>();

        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            int count = dis.readInt(); // read number of students

            for (int i = 0; i < count; i++) {
                String name = dis.readUTF();
                int age = dis.readInt();
                String grade = dis.readUTF();
                students.add(new Student(name, age, grade));
            }

            System.out.println("Students loaded from binary file.");
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        return students;
    }

    // Main method to test
    public static void main(String[] args) {
        String filename = "students.dat";

        // Create some students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, "A"));
        students.add(new Student("Bob", 22, "B"));
        students.add(new Student("Charlie", 21, "A"));

        // Save to file
        saveStudents(students, filename);

        // Load from file
        List<Student> loadedStudents = loadStudents(filename);

        // Display loaded students
        System.out.println("\nLoaded Student Data:");
        for (Student s : loadedStudents) {
            s.display();
        }
    }
}
