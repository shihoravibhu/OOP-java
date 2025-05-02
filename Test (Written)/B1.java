
// 0 1 1 2 3 5
import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0, b = 1, n;

        System.out.println("Enter First n : ");
        n = sc.nextInt();

        if (n == 1) {
            System.out.print(a + "  ");
           

        } else if (n == 2) {
            System.out.print(a + "  " + b);
          
        }

        else {

        

        for (int i = 3; i <= n; i++) {

            int temp = a;
            a = b;
            b += temp;

            if(i==3){

                System.out.println(0);
                System.out.println(1);
            }

            System.out.println(b);

        }
    }
        sc.close();

    }
}
