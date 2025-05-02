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

    // Convert to CSV string
    public String toString() {
        return name + "," + age + "," + grade;
    }

    // Create Student from CSV string
    public static Student fromString(String data) {
        String[] parts = data.split(",");
        if (parts.length == 3) {
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            String grade = parts[2];
            return new Student(name, age, grade);
        } else {
            return null;
        }
    }
}

public class Lab12c1 {

    // Save a list of students to a file
    public static void saveStudents(List<Student> students, String filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            for (Student s : students) {
                fos.write((s.toString() + "\n").getBytes());
            }
            fos.close();
            System.out.println("Students saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    // Read students from a file
    public static List<Student> loadStudents(String filename) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filename);
            Scanner scanner = new Scanner(fis);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Student s = Student.fromString(line);
                if (s != null) {
                    students.add(s);
                }
            }

            fis.close();
            scanner.close();
            System.out.println("Students loaded successfully.");
        } catch (IOException e) {
            System.out.println("Error reading from file.");
        }

        return students;
    }

    // Main method to test
    public static void main(String[] args) {
        String filename = "students.txt";

        // Create some sample students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, "A"));
        students.add(new Student("Bob", 22, "B"));
        students.add(new Student("Charlie", 21, "A"));

        // Save to file
        saveStudents(students, filename);

        // Load from file
        List<Student> loadedStudents = loadStudents(filename);

        // Print loaded students
        System.out.println("Loaded Students:");
        for (Student s : loadedStudents) {
            System.out.println("Name: " + s.name + ", Age: " + s.age + ", Grade: " + s.grade);
        }
    }
}
