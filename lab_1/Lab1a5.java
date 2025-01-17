import java.util.Scanner;

public class Lab1a5{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number in meter : ");
		double num = sc.nextDouble();

		double  feet = num * 3.28 ;

		System.out.println(feet);

		sc.close();
	}
}