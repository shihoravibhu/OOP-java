public class A3{

    public static boolean strPalindrome(String str1 , String str2){

        for (int i=str1.length()-1; i>=0; i--) {

           

            str2 += str1.charAt(i);

            if(str1.equals(str2)){
                return true ;
            }
            
        }

        return false ;
    }
    public static void main(String[] args){

        System.out.println(strPalindrome("aba",""));

    }
}