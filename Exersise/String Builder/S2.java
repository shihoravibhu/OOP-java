public class S2 {
    public static void main(String[] args) {
        
        StringBuilder s = new StringBuilder("heyy");

        for(int i = 0 ; i < s.length()/2 ; i++){

            int front = i ;                       // index find karva matee pelaa
            int back = s.length() - 1 - i ;

            char frontChar = s.charAt(front);      //find kareli index no char gotva matee
            char backChar = s.charAt(back);

            s.setCharAt(front , backChar);
            s.setCharAt(back , frontChar);
        }
        System.out.println(s);
    }
}
