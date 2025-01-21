import java.util.Scanner;

public class Lab4b1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String : ");
        String s = sc.nextLine();

        int length = s.length();

        System.out.println("String length : " + length);

        if (length % 2 == 0) {
            System.out.println("second half String : " + s.substring(length / 2));
        }

        else {
            System.out.println("second half String : " + s.substring(length / 2 + 1));
        }
        
        sc.close();

    }
}
