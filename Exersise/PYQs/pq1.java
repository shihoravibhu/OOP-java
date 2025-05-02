// Implement a Java program to print range of prime number entered by user using 
// method.
public class pq1 {

    public static void prime(int st , int en){

        for (int i = st; i < en; i++) {

            boolean flag = true ;

            if (i<=1) {
                flag = false ;
            }

            else{        
                
                for (int j = 2; j <= Math.sqrt(i); j++) {                    
                    
                    if (i%j==0) {
                        flag = false ;
                        break;
                    }
                    
                }
            }

          if (flag) {
            System.out.println(i);            
          }
        }
    }
    public static void main(String[] args) {

        prime(3,10);        

    }
}