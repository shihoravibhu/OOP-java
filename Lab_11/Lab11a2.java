class printGoodMorning implements Runnable {

    @Override
    public void run() {

        while (true) {

            System.out.println("Good Morning");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}

class printGoodAfternoon implements Runnable {

    @Override
    public void run() {

        while (true) {

            System.out.println("Good Afternoon");

            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}

public class Lab11a2 {
    public static void main(String[] args) {

        // printGoodAfternoon obj1 = new printGoodAfternoon();
        // printGoodMorning obj2 = new printGoodMorning();

        // Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2);

        Thread t1 = new Thread(new printGoodAfternoon());
        Thread t2 = new Thread(new printGoodMorning());

        t1.start();
        t2.start();

    }

}
