public class Lab10c1 {
    public static void main(String[] args) {

        while (true) {

            int num = (int) (Math.random() * 100);

            try {

                if ((num < 10) || (num > 50)) {

                    throw new Exception("Out Of Range..");

                }

                else {
                    System.out.println((int) (Math.pow(num, 2)));
                }

            }

            catch (Exception e) {

                System.out.println(e);

            }
            try {
                Thread.sleep(800);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
