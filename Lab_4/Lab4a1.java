import java.util.Scanner;

public class Lab4a1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String : ");
        String s = sc.nextLine();

        int cons = 0, vowel = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u'
                    || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
                    || s.charAt(i) == 'U') {

                vowel++;
            }

            else {

                cons++;
            }

        }

        System.out.println("Total number of consonants : " + cons);
        System.out.println("Total number of vowel : " + vowel);

        sc.close();

    }
}