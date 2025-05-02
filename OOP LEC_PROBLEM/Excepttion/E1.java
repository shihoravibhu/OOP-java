import java.util.Scanner;
public class E1{
    public static void main(String[] args) {

        try {
            getper();
            
        } 
        catch (Exception e) {
            System.out.println("Kaik tofan Thaya");
        }

        
        
    }
    public static void getper() throws Exception{

        Scanner sc = new Scanner(System.in);

        try {
        int n1=2;
        int n2=sc.nextInt();


            int sum = n1/n2 ;
        } catch (ArithmeticException e) {
            // TODO: handle exception
            // e.printStackTrace();
            System.out.println("N2 cannot be zero..");
        }

        

    }
}