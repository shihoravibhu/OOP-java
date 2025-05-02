import java.util.*;
public class Lab10b1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            
            System.out.println("Enter Two Numbers : ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            
            int div = num1/num2 ;

            System.out.println(div);
            
        }

        catch(InputMismatchException e){
            System.out.println("Enter Proper Intiger Input..");
        }

        catch(ArithmeticException e){
            System.out.println("Num1 Is Cannot Be Divide By Zero.. Please Enter Proper input..");
        }
        
        catch(Exception e){
            e.printStackTrace();
        }

        sc.close();        

    }
}
