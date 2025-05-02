import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String : ");
        String s = sc.nextLine();

        int conscapital = 0, vowelcapital = 0 ,vowelsmall=0 , conssmall = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
                    || s.charAt(i) == 'U') {

                vowelcapital++;
            }

            else if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
            || s.charAt(i) == 'u'){
                 
                vowelsmall++;

            }

            else if(s.charAt(i) >= 65 && s.charAt(i) <= 90 ) {

                conscapital++;
            }

            else if(s.charAt(i) >= 97 && s.charAt(i) <= 122 ) {

                conssmall++;
            }



        }
        System.out.println("Total number of consonants in small: " + conssmall);
        System.out.println("Total number of consonants in capital : " + conscapital);
        System.out.println("Total number of vowelsmall : " + vowelsmall);
        System.out.println("Total number of vowelcapital : " + vowelcapital);

        sc.close();

    }
}