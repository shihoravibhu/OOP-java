import java.util.Scanner ;

public class Lab3a4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = sc.nextInt();

        int sum = 0;

        for(int i=2 ; i<num ; i++){

            if(num % i == 0){
                sum = 0 ;
                break ;
            }
            else{
                sum = 1 ;
            }            

        }

        if(sum==0){
            System.out.println(num+" is not prime");
           
        }
        else{
            System.out.println(num+" is prime");
        }

        sc.close();

    }
}
