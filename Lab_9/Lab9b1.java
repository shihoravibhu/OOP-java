interface Shape{
    public void getArea();
}
class Rectangle implements Shape{

    public void getArea(){
        System.out.println("Rectangle Area : l * b");
    }
    
}
class Circle implements Shape{

    public void getArea(){

        System.out.println("Circle Area : 3.14 * r * r");
    }
    
}

class Triangle implements Shape{
    public void getArea(){
    
        System.out.println("Triangle Area : 0.5 * a * b");
    }

}
public class Lab9b1{
    public static void main(String[] args) {
        
        Rectangle obj1 = new Rectangle();
        Circle obj2 = new Circle();
        Triangle obj3 = new Triangle();

        obj1.getArea();
        obj2.getArea();
        obj3.getArea();
    }
}