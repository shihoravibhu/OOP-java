import java.io.*;

public class Lab12b1 {
    
    public static void main(String[] args) {
        // Check if a filename is provided
        if (args.length != 1) {
            System.out.println("Usage: java CountDigitFive <filename>");
            return;
        }

        String filename = args[0];
        int count = 0;

        try {
            // Open the file
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            int character;

            // Read each character from the file
            while ((character = reader.read()) != -1) {
                if ((char) character == '5') {
                    count++;
                }
            }

            reader.close();

            // Print the result
            System.out.println("Number of times digit '5' appears: " + count);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}