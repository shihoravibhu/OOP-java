// s
// st
// str
// stre
// strea
// stream

public class p15 {
    public static void main(String[] args) {
        
        String s = "stream" ;

        for(int i=0 ; i<s.length() ; i++){
            for(int j=0 ; j<=i ; j++){

                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
