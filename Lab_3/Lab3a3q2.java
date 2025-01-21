import java.util.Scanner;

public class Lab3a3q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a :");
        double a = sc.nextDouble();

        System.out.println("enter b :");
        double b = sc.nextDouble();

        System.out.println("enter c :");
        double c = sc.nextDouble();

        double largest = Math.max(a, Math.max(b, c));

        if (a == b && b == c) {
            System.out.println("a=b=c");
        }

        else if (largest == a) {
            System.out.println("Largest number is : " + a);
        }

        else if (largest == b) {
            System.out.println("Largest number is : " + b);
        }

        else if (largest == c) {
            System.out.println("Largest number is : " + c);
        }

        else {
            if (a == c) {
                System.out.println("a==c");
            } else if (b == c) {
                System.out.println("b==c");
            } else if (a == b) {
                System.out.println("a==b");
            }
        }

        sc.close();

    }
}
