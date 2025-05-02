import java.util.Arrays;

public class pq2 {
    public static void main(String[] args) {
        
        int[] arr = {1,9,6,2,10,3,99,44,22,5,8} ;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j] ;
                    arr[j] = temp ;
                }
            }
            
        }
        System.out.println(Arrays.toString(arr));

    }
}
