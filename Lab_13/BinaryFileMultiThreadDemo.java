import java.io.*;
import java.util.*;

class BinaryWriterThread extends Thread {
    private String filename;
    private List<Integer> data;

    public BinaryWriterThread(String filename, List<Integer> data) {
        this.filename = filename;
        this.data = data;
    }

    public void run() {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            for (int num : data) {
                if (Thread.interrupted()) {
                    System.out.println("Thread was interrupted. Stopping writing...");
                    return;
                }

                dos.writeInt(num);
                System.out.println("Writing: " + num);

                Thread.yield(); // Give other threads a chance
                Thread.sleep(100); // Slow down to simulate time-consuming task
            }
            System.out.println("Finished writing to file: " + filename);
        } catch (IOException | InterruptedException e) {
            System.out.println("Exception in thread: " + e.getMessage());
        }
    }
}

public class BinaryFileMultiThreadDemo {
    public static void main(String[] args) {
        // Sample data
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // Create thread
        BinaryWriterThread writerThread = new BinaryWriterThread("data.bin", numbers);
        writerThread.start();

        // Main thread does something else
        for (int i = 1; i <= 3; i++) {
            System.out.println("Main thread working... " + i);
            Thread.yield(); // Yielding to give writerThread a chance
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }

        // Demonstrate join
        try {
            System.out.println("Main thread waiting for writer thread to finish...");
            writerThread.join();
        } catch (InterruptedException e) {
            System.out.println("Join interrupted");
        }

        // Optional: Interrupt (won't do anything here because join is done)
        // writerThread.interrupt();

        System.out.println("Main thread ends.");
    }
}
 
    

