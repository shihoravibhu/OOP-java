import java.util.Scanner ;

public class Lab3b2 {
    public static void main(String[] args) {

               Scanner sc = new Scanner(System.in);

               System.out.println("Enter number : ");
               int num = sc.nextInt() ;

               int revnum = 0 , rem =0 , originalnum;

               originalnum = num ;

               while(num!=0){

                rem = num % 10 ;

                revnum = revnum * 10 + rem ;

                num = num / 10 ;                

               }

               if(revnum == originalnum){

                System.out.println(originalnum +" is palindrome number");

               }

               else {

                System.out.println(originalnum +" is not palindrome number");

               }

               sc.close();

        
        
    }
}
