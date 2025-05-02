import java.util.Scanner;

public class ManualStringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Manually calculate length
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        System.out.println("Length of the string: " + length);

        // Print second half of the string
        String secondHalf = "";
        for (int i = length / 2; i < length; i++) {
            secondHalf += text.charAt(i);
        }
        System.out.println("Second half of the string: " + secondHalf);

        scanner.close();
    }
}
