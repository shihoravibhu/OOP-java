import java.util.Scanner;
public class B_P4{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        int dis1=0 , dis2=0 , num1 = 0 , num2 =0 ;
        
        for(int i=n ;; i++){
            boolean flage = false ;
            for(int j=2 ; j<i ; j++){
                if(i%j==0){
                    flage = true ;
                    break;
                }
            }
            if(flage==false){
                
                dis1 = i - n ;
                num1  = i ;
                
                if(dis1 == 0){
                    System.out.println(i);
                    
                    
                    return;
                }
                
                break;
            }
        }
        
        for(int i=n-1 ;i>=2; i--){
            boolean flage2 = false ;
            for(int j=2 ; j<i ; j++){
                if(i%j==0){
                    flage2 = true ;
                    break;
                }
                
            }
            if(flage2==false){
                
                dis2 = n - 1 - i ;
                
                num2 = i ;
                
                
                
                break;
            }
        }
        
        if(dis1>dis2){
            System.out.println(num2);
        }
        else{
            
            System.out.println(num1);
        }
        
        
        sc.close();
    }
    
}