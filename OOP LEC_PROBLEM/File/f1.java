import java.io.File;
import java.util.Date;
public class f1{
    public static void main(String[] args) {
        
        File f = new File("file1.txt");

        Date dt = new Date(f.lastModified());

        System.out.println(dt);
       

        System.out.println( );

        
        
    


    }
}