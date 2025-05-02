import java.util.Scanner;
public class E1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter MSG : ");        
        String msg = sc.nextLine() ;

        System.out.println("Enter 1 For Encryption And 0 For decryption : ");
        int type = sc.nextInt();

        System.out.println("Enter A Key : ");
        int key = sc.nextInt();

        for(int i=0 ; i<msg.length() ; i++){

            int temp = msg.charAt(i);

            if(type==1){
                temp+=key ;
            }

            else if(type==0){
                temp-=key ;
            }
            else{
                System.out.println("Enter Valid Key.");
                break;
            }

            System.out.print((char)temp);
        }
        sc.close();
    }
}