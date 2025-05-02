public class B_P3 {
    public static void main(String[] args) {

        int[][] a = { { 1, 2, 3 },
                      { 4, 5, 6 },
                      { 7, 8, 9 } };

        int[][] b = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {

                b[j][i] = a[i][j];
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {

                a[i][a.length-1-j] = b[i][j];
                
            }
           
        }

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    System.out.print(a[i][j]);
                }
                System.out.println();

            }

        }
    }

