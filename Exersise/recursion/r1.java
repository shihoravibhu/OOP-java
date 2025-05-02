// import java.util.Scanner;

public class r1 {

    public static void sumofnum(int i,int n,int sum) {
        

        if (i > n)  {
            System.out.println(sum);
            return;
        }

        sum = sum + i;

       
        sumofnum(i+1,n,sum);

    }
    
    public static void main(String[] args) {

       

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter tottal numbers :");
        // int n = sc.nextInt();

        sumofnum(1,5,0);

    }

   
}
