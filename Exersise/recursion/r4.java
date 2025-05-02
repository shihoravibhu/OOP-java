public class r4 {

    public static void pow(int a,int n,int ans){

        if(n==1){
            ans*=a;
            System.out.println(ans);
            return;
        }

        ans*=a;

        pow(a,n-1,ans);


        

    }
    public static void main (String[] args){

        int a = 2 ;
        int n = 4 ;

        pow(a,n,1);
    }
}
