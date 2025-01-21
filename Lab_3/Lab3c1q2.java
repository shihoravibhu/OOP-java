// second method reverse thi prime che k nai ee check karva mate big --> small num 

import java.util.Scanner;

public class Lab3c1q2 {
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

        for (int i = bignum ; i > smallnum + 1; i--) {

            int sum = 0;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {

                    sum = 1;

                    break;

                }

            }
            if (sum == 0 && i > 1) {

                System.out.println(i + " is prime number");
            }

        }
        sc.close();

    }
}
