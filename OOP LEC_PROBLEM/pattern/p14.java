//     * * * * *
//       * * *
//        * *
//         *
//         *  
//        * *
//       * * *
//     * * * * *

public class p14 {
    public static void main(String[] args) {

        int n = 5;

        // Upper half of the pattern
        for (int i = 0; i < n; i++) {
            // Printing leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 0; j < (n - i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half of the pattern
        for (int i = 0; i < n; i++) {
            // Printing leading spaces
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 0; j < (i + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
