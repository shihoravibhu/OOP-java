class Keyword {
    
    int instanceVariable ;
    static int staticVariable;

    public Keyword(int instanceVariable){

        this.instanceVariable=instanceVariable;
        this.staticVariable=11;
    }

    public void access(){
        System.out.println(this.instanceVariable);

        // System.out.println(this.staticVariable);  ahiya apde koi static Variable ne This. Access kari Sakiye Nahiye Tene Access Karva Mate Class_Name. Karine Karvu

        System.out.println(Keyword.staticVariable);  // Static Variable Ne Access Karva Mate 
    }

}
public class Lab6c1 {

    public static void main(String[] args) {

        Keyword k1 = new Keyword(10);

        k1.access();


    }
}
