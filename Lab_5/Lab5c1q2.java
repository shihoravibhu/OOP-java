import java.util.*;

public class Lab5c1q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter array element of index " + i);
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        System.out.println("Enter the index pivot");
        int k = sc.nextInt();
        System.out.println();

        if(1<=k && k<arr.length){

            int[] nums = new int[n];

        int j = 0;
        for (int i = k; i < arr.length; i++) {

            nums[j] = arr[i];

            j++;

        }

        for (int i = 0; i < k; i++) {

            nums[j] = arr[i];

            j++;
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.println(nums[i]);
        }

        System.out.println("enter target : ");
        int target = sc.nextInt();

        boolean flage = false;

        int index=0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {

                flage = true;
                index = i;
                break;
            }
        }

        if (flage == true) {
            System.out.println("target index :" + index);
        } else {
            System.out.println("-1");
        }

        sc.close();
        
        }

        

    }

}
