public class E10 {

    E10(){
        System.out.println("Const");
    }
    public static void main(String[] args) {
        E10 obj = new E10();
        E10 obj1 = new E10();
        E10 obj2 = new E10();
        // System.out.println("main");
    }
    {
        System.out.println("curly");
    }
    static{
        System.out.println("stat");
    }
}
