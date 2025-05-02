// *      *              butterfly pattern
// **    **
// ***  ***
// ********
// ***  ***
// **    **
// *      *

public class p8 {
    public static void main(String[] args) {
        
        for(int i=1 ; i<=4 ; i++){      // upper
            for(int j=1 ; j<=i ; j++){   //leftside
                System.out.print("*");
            }
            for(int k=1 ; k<=(2*4)-2*i ; k++){   //spacing
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++){     //rightside
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=3 ; i>=1 ; i--){       //lower
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            for(int k=1 ; k<=(2*4)-2*i ; k++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
