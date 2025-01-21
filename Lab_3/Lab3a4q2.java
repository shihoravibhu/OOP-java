import java.util.* ;

public class Lab3a4q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number :");
        int num = sc.nextInt();

        // boolean b = true ;

        // if(num==2){

        // }

        for(int i=2 ; i<(int)Math.sqrt(num) ; i++){

            if(num % i == 0){
                System.out.println(num+" is not prime number");
                break;
            }
            else if(num % i != 0){
                // System.out.println(num+" is prime number");
                i++;
            }
            else{
                System.out.println(num+" is prime number");
            }
        }

       

        sc.close();
        
    }
}
