import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;

        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();

        int i = 1;

        do {

            System.out.print(n1 + " ");

            int sum = n1 + n2;

            n1 = n2;
            n2 = sum;
 
            i++;
        } while (i <= range);

        sc.close();
    }
}
