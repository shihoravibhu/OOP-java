import java.util.Scanner;
public class E1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();

        avg(n1,n2,n3);
        
        
        sc.close();
    }
    static void avg(int n1 , int n2 , int n3){

        System.out.println((n1+n2+n3)/3.0);

        return;
    }

}