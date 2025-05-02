interface A{
    int a = 1;
    
    public int displaya();
}

interface A1 extends A{
    
    int b = 2;

    public int displayb();
}

interface A2 extends A{
    
    int c = 3;

    public int displayc();
}

interface A12 extends A1,A2{
    
    int d = 4;
    public int displayd();
}

class B implements A12{

    public int displaya(){
        return a;
    }
    public int displayb(){
        return b;
    }
    public int displayc(){
        return c;
    }
    public int displayd(){
        return d;
    }
}

public class Lab8a2 {
    public static void main(String[] args) {
        
        B obj = new B();

        System.out.println(obj.displaya());
        System.out.println(obj.displayb());
        System.out.println(obj.displayc());
        System.out.println(obj.displayd());

    }
}
