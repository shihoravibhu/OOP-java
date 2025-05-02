class SumOfRow extends Thread {
    int[] row;
    int rowIndex;

    SumOfRow(int[] row, int rowIndex) {
        this.row = row;
        this.rowIndex = rowIndex;
    }

    public void run() {
        int sum = 0;

        for (int j = 0; j < row.length; j++) {
            sum += row[j];
        }

        System.out.println(sum);

    }
}

public class Lab11c1 {
    public static void main(String[] args) {

        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int i = 0;

        SumOfRow[] obj = new SumOfRow[3];
        
        for (i = 0; i < 3; i++) {

            int[] r = new int[3];

            for (int j = 0; j < 3; j++) {
                r[j] = a[i][j];
            }

            obj[i] = new SumOfRow(r, i);
            obj[i].start();

            try {
                Thread.sleep(300);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
