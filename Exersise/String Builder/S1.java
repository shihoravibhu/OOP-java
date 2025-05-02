public class S1{
    public static void main(String[] args) {
        
        StringBuilder s = new StringBuilder("hello");

        System.out.println(s.charAt(0));
        
        s.setCharAt(0, 'k');
        System.out.println(s);
        
        s.insert(0, 'k');
        System.out.println(s);
        
        s.delete(0, 1);
        System.out.println(s);
        
        s.append('h');
        System.out.println(s);
        
        

    }
}