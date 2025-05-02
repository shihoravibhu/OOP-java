import java.io.File;

public class FileChecker {
    public static void main(String[] args) {
        // Check if a name is provided
        if (args.length != 1) {
            System.out.println("Usage: java FileChecker <file_or_directory_path>");
            return;
        }

        // Get the path from command line
        String path = args[0];
        File file = new File(path);

        // Check if it exists
        if (!file.exists()) {
            System.out.println("The path does not exist.");
            return;
        }

        // Check if it's a file
        if (file.isFile()) {
            System.out.println("It is a file.");
            System.out.println("File size: " + file.length() + " bytes");
        }
        // Check if it's a directory
        else if (file.isDirectory()) {
            System.out.println("It is a directory.");
            String[] files = file.list();
            if (files != null && files.length > 0) {
                System.out.println("Files inside the directory:");
                for (String f : files) {
                    System.out.println("- " + f);
                }
            } else {
                System.out.println("The directory is empty.");
            }
        }
    }
}

