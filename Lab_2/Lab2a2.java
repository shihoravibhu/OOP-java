import java.util.Scanner;

public class Lab2a2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter add (+), sub (-) , div (/) and mul (*)");
		String s = sc.next();

		System.out.println("enter num1 :");
		double num1 = sc.nextDouble();

		System.out.println("enter num2 :");
		double num2 = sc.nextDouble();

		if (s.equals("+")) {

			System.out.println(num1 + num2);

		}

		else if (s.equals("-")) {

			System.out.println(num1 - num2);

		}

		else if (s.equals("/")) {

			System.out.println(num1 / num2);

		}

		else if (s.equals("*")) {

			System.out.println(num1 * num2);

		}
		sc.close();

	}
}