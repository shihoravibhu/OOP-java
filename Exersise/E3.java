import java.util.Scanner;
public class E3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int pos = 0 ;
        int neg = 0 ;
        int zero = 0 ;


        while(true){
            System.out.println("Enter choice y or Y to continue :");
            char ch = sc.next().charAt(0);
            if(ch=='y' || ch=='Y'){
                System.out.println("Enter number :");
                int num=sc.nextInt();

                if(num>0){
                    pos++;
                }
                else if(num<0){
                    neg++;
                }
                else{
                    zero++;
                }
            }
            else
            {
                break;
            }
        }
        System.out.println("positive num : "+pos);
        System.out.println("negaitive num : "+neg);
        System.out.println("zero : "+zero);

        sc.close();

    }
}
