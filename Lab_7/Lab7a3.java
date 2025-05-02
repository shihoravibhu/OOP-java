// By Super keyword......
// We Can call Constructor,Function,Variable Of Base Class 

class Base {

    int a = 101 ;

    public Base() {
        System.out.println("Base (Parent Class) Constructor");
    }

    public void display() {
        System.out.println("Heyy..(From Base Class)");
    }
}

class Derived extends Base {

    public Derived() {
        super();                             // Calls Base Class Constructor (1)
        System.out.println("Derived (Chlid Class) Constructor");
    }

    public void display() {
        super.display();                      // Calls Base Class Method (2)
        System.out.println("Hello..(From Derived Class)");

        System.out.println(super.a);          // Calls Base Class Variable (3)
    }

}

public class Lab7a3 {
    public static void main(String[] args) {

        Derived d1 = new Derived();

        d1.display();

    }
}
