import java.util.Scanner;

public class Lab3b1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter year :");
        int y = sc.nextInt();

        if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {

            System.out.println(y + " is leap year");
        } else {
            System.out.println(y + " is not leap year");
        }
        sc.close();

    }
}
