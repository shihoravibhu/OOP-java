import java.util.Date;
class Mythread extends Thread{

    public void run(){
        System.out.println("Heyyy From Thread.");
    }

}

public class m1 {
    public static void main(String[] args) {
        
        Mythread obj1 = new Mythread();
        Date d1 = new Date();
        
        obj1.start();
        
        System.out.println("Heyyy From Main Method 1");
        System.out.println("Heyyy From Main Method 2");
        System.out.println("Heyyy From Main Method 3");
        System.out.println("Heyyy From Main Method 4");
        System.out.println("Heyyy From Main Method 5");
        System.out.println("Heyyy From Main Method 6");
        System.out.println("Heyyy From Main Method 7");
        System.out.println("Heyyy From Main Method 8");
        System.out.println("Heyyy From Main Method 9");

        Date d2 = new Date();

        long a = d2.getTime()-d1.getTime();

        System.out.println((long)a);

        System.out.println(d2);
    }
}