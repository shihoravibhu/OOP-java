// without any arithmetic oprater

// without modulo

import java.util.Scanner ;

public class Lab3a2q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :");
        int num = sc.nextInt();

        int res = num & 1 ;

        if (res == 1) {

        	System.out.println("odd");
        	
        }

        else{
        	System.out.println("even");

       
        sc.close();

    }
}
}