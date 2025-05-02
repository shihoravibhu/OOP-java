import java.util.Scanner;
class B3{
    public static void main(String[] args) {
    
        char[] ch = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] count = new int[26];

        Scanner sc = new Scanner(System.in);        

        System.out.println("Enter String : ");
        String str = sc.nextLine().toLowerCase();

        for(int i=0 ; i<ch.length ;i++){

            for(int j=0 ; j<str.length() ;j++){

                if(ch[i]==str.charAt(j)){
                    count[i]++;
                }

            }

        }

        for(int i=0 ; i<ch.length ; i++){

            if(count[i]>0){
                System.out.println(ch[i] + " " + count[i]);
            }
        }

        sc.close();


    }
}