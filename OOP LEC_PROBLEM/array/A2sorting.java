public class A2sorting {
    public static void main(String[] args) {

        int[] data = new int[5];

        data = new int[] { 1, 7, 3, 9, 2, 10 };

        for (int i = 0; i < data.length; i++) {
            int min = i;
            for (int j = i + 1; j < data.length; j++) {

                if (data[j] < data[i]) {
                    min = j;
                }
            }
           int temp = data[min];
           data[min] = data[i] ;
           data[i] = temp ;

        }

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
