class Member{

String name ; 
int age ; 
String phone_Number ; 
String address ; 
double salary ;

public Member(String name , int age , String phone_Number , String address , double salary){

    this.name = name ;
    this.age = age ;
    this.phone_Number = phone_Number ;
    this.address = address ;
    this.salary = salary ;

}

public void printSalary(){
    System.out.println(" Salary : " + this.salary);
}


}

class Employee extends Member{
    String specialization ;

    public Employee(String name , int age , String phone_Number , String address , double salary ,String specialization){
        super(name , age , phone_Number , address ,  salary);
        this.specialization = specialization ;
    }

    public void display(){
        System.out.println("\nEmployee Details:");
        System.out.println(" Name : "+this.name +"\n Age : "+this.age +"\n Phone Number : "+ this.phone_Number +"\n Address :" +this.address+"\n specialization : "+this.specialization);
        printSalary();
        
    }
}
class Manager extends Member{
    String department ;
    
    public Manager(String name , int age , String phone_Number , String address , double salary ,String department){
        super(name , age , phone_Number , address ,  salary);
        this.department = department ;
    }
    public void display(){
        System.out.println("\nManager Details:");
        System.out.println(" Name : "+this.name +"\n Age : "+this.age +"\n Phone Number : "+ this.phone_Number +"\n Address :" +this.address + "\n department : "+this.department);
        printSalary();
        
        
    }

}
public class Lab7b1 {
    public static void main(String[] args) {
        
        Employee e1 = new Employee("o",25,"1234567890","aaaa",9999,"M");

        Manager m1 = new Manager("k",22,"1122334455","iiii",55555,"Main");

        e1.display();
        m1.display();

       
    }
}
