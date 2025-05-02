// import java.util.Stack;
public class pq4 {
    public static void main(String[] args) {

        // Stack<String> s = new Stack<String>() ;
        
        for (int i = 0; i < 4; i++) {
            for(int j=0 ; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();            
        }

        for(int i=2 ; i>0 ; i--){
            for(int j=0 ;j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
