class Base1{
    
    Base1(){
        System.out.println("Base");
    }
}

class Derived1 extends Base1{
    Derived1(){
        System.out.println("Derived1");
    }
}
class Derived2 extends Derived1{
    Derived2(){
        System.out.println("Derived2");
    }


}
public class O9_Inheritance3 {
    public static void main(String[] args) {

        Derived2 obj = new Derived2();
        
    }
}
