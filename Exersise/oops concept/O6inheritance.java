class Base {
    int x;

    public Base() {
        System.out.println("Hello I am Constructure");
    }

    public Base(int x) {
        System.out.println("Hello I am Constructure with value x = " + x);
    }

}

class Derived extends Base {

    int y;
    int z;

    public Derived() {
        System.out.println("Hello I am Constructure From Derived");
    }

    public Derived(int y, int z) {

        super(z);

        System.out.println("Hello I am Constructure with value z = " + z);

    }

}

public class O6inheritance {
    public static void main(String[] args) {

        // Derived d1 = new Derived(5, 6);

        Derived d1 = new Derived();

       

    }
}
