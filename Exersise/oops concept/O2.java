class Student{

    String name ;
    int age ;

    public void printStudentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name , int age){    // in built parameter  (constracture)
        this.name = name ;
        this.age = age ;
    }
}

public class O2 {
    public static void main(String[] args){

        Student s1 = new Student("v",17);
       
        s1.printStudentInfo();
    }
}
