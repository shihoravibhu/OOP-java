class Mt extends Thread {
   @Override
   public void run() {
      for (int i = 1; i <= 20; i++) {
         if (i % 2 != 0) {
            System.out.println(i);
         }
      }
   }
}

class Mt2 extends Thread {
   @Override
   public void run() {
      for (int i = 1; i <= 20; i++) {
         if (i % 2 == 0) {
            System.out.println(i);
         }
      }
   }
}

public class m2 {
   public static void main(String args[]) {
      Mt t1 = new Mt();
      t1.start();
      
      // try{
      // Thread.sleep(1000);
      // }
      // catch(Exception e) {}

      try {
         t1.join();
      } catch (Exception e) {
      }
      
      Mt2 t2 = new Mt2();
      t2.start();
   }
}