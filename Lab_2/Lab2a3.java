import java.util.Scanner ; 
public class Lab2a3 {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a :");
		double a = sc.nextDouble();

		System.out.println("enter b :");
		double b = sc.nextDouble();

		System.out.println(a * b);

		sc.close();
	}
}