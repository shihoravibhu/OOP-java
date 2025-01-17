import java.util.Scanner ;

public class Lab1a4_q2{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("enter num1 : ");
		int num1 = sc.nextInt() ;

		System.out.println("enter num2 : ");
		int num2 = sc.nextInt() ;

		int sum = num1 + num2 ;

		System.out.println(sum);

		sc.close();

	}
}