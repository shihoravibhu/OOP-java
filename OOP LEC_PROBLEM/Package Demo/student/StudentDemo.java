package student ;

public class StudentDemo {

    protected static int a = 10; // If we don't use static, we need to create an object of this class to access variable 'a'. Here, we use static not for access modifier but to avoid object creation.
    
    public static void main(String[] args) {
        System.out.println(a);
    }
}