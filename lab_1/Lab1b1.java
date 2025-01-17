import java.util.Scanner ;

public class Lab1b1{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		char ch = sc.next().charAt(0);

		if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u') || (ch=='A') || (ch=='E') || (ch=='I') || (ch=='O') || (ch=='U')){

			System.out.println("entered latter is vowel");
		}
		
		else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			System.out.println("eneterd latter is constant");
		}

		else 
		{
			System.out.println("eneterd latter is invalid ");
		}

		sc.close();
	}

}