//     1
//    212
//   32123
//  4321234
// 543212345

public class p11 {
    public static void main(String[] args){

        for(int i=1 ; i<=5 ; i++){
           
            for(int j=1 ; j<=5-i ; j++){  //spacing
                System.out.print(" ");
            }
            for(int a=i ; a>1 ; a--){     //leftside            
                System.out.print(a);
            }

            for(int k=1 ; k<=i ; k++){     //rightside         
                System.out.print(k);
            }
            System.out.println();
            
        }
    }
}
