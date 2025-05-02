import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int studentID;
    String studentName;
    int studentRollNo;
    float studentSPI;

    // Constructor
    public Student(int studentID, String studentName, int studentRollNo, float studentSPI) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
        this.studentSPI = studentSPI;
    }

    // Display method
    public void display() {
        System.out.println("ID: " + studentID +
                ", Name: " + studentName +
                ", Roll No: " + studentRollNo +
                ", SPI: " + studentSPI);
    }
}

public class StudentListSortDemo {
    public static void main(String[] args) {
        // Create ArrayList to store Student objects
        ArrayList<Student> studentList = new ArrayList<>();

        // Add some students
        studentList.add(new Student(1, "Alice", 101, 8.7f));
        studentList.add(new Student(2, "Bob", 102, 7.9f));
        studentList.add(new Student(3, "Charlie", 103, 9.1f));
        studentList.add(new Student(4, "Diana", 104, 8.3f));

        // Sort students by SPI in descending order
        Collections.sort(studentList, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Float.compare(s2.studentSPI, s1.studentSPI); // descending
            }
        });

        // Display sorted list
        System.out.println("Students sorted by SPI (highest to lowest):\n");
        for (Student s : studentList) {
            s.display();
        }
    }
}
