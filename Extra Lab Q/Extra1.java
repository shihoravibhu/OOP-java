class Student{
    String name ;
    int roll_no ;
    double SPI ;
    String course ;

    public void setter(String name , int roll_no , double SPI , String course){
        this.name = name ;
        this.roll_no = roll_no ;
        this.SPI = SPI ;
        this.course = course ;
    }

    public void getter(){
        System.out.println("Student Name is "+ this.name + ", Roll No is "+roll_no+" SPI "+SPI +" Course"+course);
    }
}
public class Extra1{
    public static void main(String args[]){

        Student s1 = new Student();

        s1.setter("vibhu",101 , 8.85,"CSE");
        s1.getter();
        

    }
}