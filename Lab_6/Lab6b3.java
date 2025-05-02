class Object{
    static int sumOfTotalObject ;

    public Object(){
        sumOfTotalObject++;
    }

    public void Sum(){
        // System.out.println("number of "+sumOfTotalObject+" objects created ");

        System.out.println("number of "+ Object.sumOfTotalObject+" objects created ");      // Koi Pan Static Variable Ne Apdee Sada Variable Ni Jem this. Karine Access No Kari Sakiye Static Variable Access Karva Mate Class_Name. Karvu Pade

        // Ane Satic Variable Ne Apde Static Method Ma No muki Skiye
    }

}
public class Lab6b3 {
    public static void main(String[] args) {

        Object o1 = new Object() ;
        Object o2 = new Object() ;
        Object o3 = new Object() ;
        Object o4 = new Object() ;

        o1.Sum();


        // System.out.println(o1.sumOfTotalObject);
        
    }
}
