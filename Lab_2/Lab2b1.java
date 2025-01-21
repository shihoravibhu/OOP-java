import java.util.Scanner ; 
public class Lab2b1 {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter fahrenhit :");
		double f = sc.nextDouble();

		double c=(f-32)*5/9;

		System.out.println("Celsius :" + c);
		
		sc.close();
	}
}