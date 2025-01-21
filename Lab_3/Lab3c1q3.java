import java.util.Scanner;

public class Lab3c1q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter starting num : ");
        int startnum = sc.nextInt();

        System.out.println("enter last num : ");
        int lastnum = sc.nextInt();

        int bignum = 0, smallnum = 0;

        if (startnum > lastnum) {

            bignum = startnum;
            smallnum = lastnum;
        }

        else {

            smallnum = startnum;
            bignum = lastnum;
        }

        for (int i = smallnum + 1; i < bignum; i++) {

            if (prime(i)) {

                System.out.println(i + " is prime number");
            } else {
                System.out.println(i + " is not prime number");
            }
        }

        sc.close();
    }

public static boolean prime(int n) {

    if(n<=1){
        return false ;
    }

    for (int j = 2; j <= (n / 2); j++) {

        if (n % j == 0) {
            return false;            
        }
        
    }
    return true;

}

}
