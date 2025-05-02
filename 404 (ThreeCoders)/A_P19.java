import java.util.*;
public class A_P19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sc.nextLine() ;

       String[] words = str.split(" ");

       StringBuilder revStr = new StringBuilder();

       for(int i=words.length-1 ; i>=0 ; i--){
        revStr.append(words[i]);
        
        if(i!=0){
            
            revStr.append(" ");
        }
       }

       System.out.println(revStr.toString());

       

        sc.close();

        
    }
}
