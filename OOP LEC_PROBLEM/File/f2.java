import java.io.FileOutputStream;

public class f2 {
    public static void main(String[] args) {

        try{
            FileOutputStream fos = new FileOutputStream("file2.txt");

            String s = "Darshan University";

            byte[] data = s.getBytes();

            fos.write(data) ;
            fos.close();

            
            
            
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
