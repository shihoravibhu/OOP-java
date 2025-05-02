import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileOutputStream;

public class Lab12a2 {
    public static void main(String[] args) {

        try {

            FileReader fr = new FileReader("file1.txt");
            BufferedReader br = new BufferedReader(fr);

            FileOutputStream fos = new FileOutputStream("file2.txt");

            String word[] = new String[0];
            String line;
            int numOfReplacement = 0;

            while ((line = br.readLine()) != null) {

                word = line.split("\\s");

                for (int i = 0; i < word.length; i++) {

                    if (word[i].equals("word1")) {

                        byte[] b = "word2".getBytes();

                        fos.write(b);
                        fos.write(" ".getBytes());

                        numOfReplacement++;

                    } else {

                        byte[] b2 = word[i].getBytes();

                        fos.write(b2);
                        fos.write(" ".getBytes());

                    }                   

                }

                fos.write("\n".getBytes());

            }

            System.out.println(numOfReplacement);

            br.close();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
