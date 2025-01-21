import java.util.Scanner;

public class Lab4a2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array :");
        int size = sc.nextInt();

        int[] a = new int[size];

        double avg = 0, sum = 0;

        for (int i = 0; i < a.length; i++) {

            System.out.println("Enter value of a" + "[" + i + "]");
            a[i] = sc.nextInt();

            sum += a[i];

        }

        avg = sum / (double) size;

        System.out.println("Average : " + avg);

        sc.close();

    }
}
