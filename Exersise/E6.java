// linear search in array 
import java.util.Scanner;

public class E6 {
	public static void main (String[] args){

		int[] a = {22,33,53,85,13,13,54,97,7,34};

		Scanner sc = new Scanner(System.in);

		System.out.println("Eneter search element : ");
		int s = sc.nextInt();

		boolean flage = false ;

		for(int i=0 ; i<a.length ; i++){
			if(a[i]==s){
				System.out.println("element is available at index " + i);
				flage = true ;
			}
		}
		if(!flage){
			System.out.println("element is not available in array");
		}
	}
}