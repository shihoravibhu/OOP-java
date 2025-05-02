import java.util.Scanner;

public class A3binarysearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = { 2, 3, 5, 6, 8, 9, 11, 18, 29, 65 }; // assending order array hovo joiyee

        int low = 0;
        int high = arr.length - 1;
        boolean isfound = false;

        System.out.println("Enter search element :");
        int searchelement = sc.nextInt();

        while (high >= low) {
            int mid = (high + low) / 2;

            if (searchelement < arr[mid]) {
                high = mid - 1;
            } else if (searchelement == arr[mid]) {
                isfound = true;
                System.out.println("element found");
                break;
            } else {
                low = mid + 1;
            }
        }
        if (!isfound) {
            System.out.println("not found");
        }

        sc.close();

    }
}
