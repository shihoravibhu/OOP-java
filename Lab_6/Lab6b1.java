import java.util.Scanner;

class Vowel {

    String sentence;
    int sumOfVowel;
    int sumOfA = 0;
    int sumOfE = 0;
    int sumOfI = 0;
    int sumOfO = 0;
    int sumOfU = 0;

    public Vowel() {

        sentence = null;
        sumOfVowel = 0;

    }

    public Vowel(String sentence) {
        this.sentence = sentence;

    }

    public String countOfVowel() {

        for (int i = 0; i < this.sentence.length(); i++) {

            if (this.sentence.charAt(i) == 'a'){

                this.sumOfA++;
                this.sumOfVowel++;

            }
            else if(this.sentence.charAt(i) == 'e'){
                
                this.sumOfE++;
                this.sumOfVowel++;

            }
            else if(this.sentence.charAt(i) == 'I'){
                
                this.sumOfI++;
                this.sumOfVowel++;

            }
            else if(this.sentence.charAt(i) == 'o'){
                
                this.sumOfO++;
                this.sumOfVowel++;

            }
            else if(this.sentence.charAt(i) == 'u'){
                
                this.sumOfE++;
                this.sumOfVowel++;

            }           
            

        }
        return "Total No of Vowel is " + this.sumOfVowel + "\n TotalA = " + this.sumOfA + "\n TotalE = " + this.sumOfE + "\n TotalO = " + this.sumOfO + "\n TotalU = " + this.sumOfU + "\n TotalI = " + sumOfI ;

    }
}

public class Lab6b1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence1;

        do {

            System.out.println("Enter Sentence :");
            sentence1 = sc.nextLine().toLowerCase().trim();

            if (sentence1.equalsIgnoreCase("quit")) {
                break;
            }

            Vowel s1 = new Vowel(sentence1);
            String ans = s1.countOfVowel();

            System.out.println(ans);

        } while (true);

        sc.close();

    }
}
