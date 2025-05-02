import java.util.ArrayList;

class Student1 {
    int studentID;
    String studentName;
    int studentRollNo;
    float studentSPI;

    // Constructor
    public Student1(int studentID, String studentName, int studentRollNo, float studentSPI) {
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

public class StudentListDemo {
    public static void main(String[] args) {
        // Create ArrayList to store Student objects
        ArrayList<Student1> studentList = new ArrayList<>();

        // Add some students
        studentList.add(new Student1(1, "Alice", 101, 8.7f));
        studentList.add(new Student1(2, "Bob", 102, 7.9f));
        studentList.add(new Student1(3, "Charlie", 103, 9.1f));
        studentList.add(new Student1(4, "Diana", 104, 8.3f));

        // Display all students
        System.out.println("Student Details:\n");
        for (Student1 s : studentList) {
            s.display();
        }
    }
}
