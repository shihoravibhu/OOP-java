import java.util.Scanner;
public class E2 {
    public static void main(String[] args) {
                
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        
        odd(n);

        sc.close();

    }

    static void odd(int n){

        if(n<=0){
            System.out.println("Enter valid input.");
        }

        for(int i=1 ; i<=n ; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    } 
}
