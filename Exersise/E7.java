// binary search in array
import java.util.*;
public class E7{
	public static void main(String[] args){

		int[] a = {22,33,53,85,13,13,54,97,7,34};

		Scanner sc = new Scanner(System.in);

		System.out.println("Eneter search element : ");
		int s = sc.nextInt();

		Arrays.sort(a);

		for(int i=0 ; i<a.length ; i++){

			System.out.println(a[i]);
		}


	}
}