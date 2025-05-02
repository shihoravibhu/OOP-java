import java.io.*;

public class Lab12a1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("a1.txt");
            String str = "Heyyy What Are You Doing ??\nThis is another line.";
            fos.write(str.getBytes());
            fos.close();

            BufferedReader br = new BufferedReader(new FileReader("a1.txt"));
            int charCount = 0, wordCount = 0, lineCount = 0;
            String line;
            
            while ((line = br.readLine()) != null) {
                lineCount++; 
                charCount += line.length();
                wordCount += line.split("\\s+").length; 
            }
            
            br.close();
            System.out.println("Characters: " + charCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Lines: " + lineCount);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

