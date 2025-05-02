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

class OddNum extends Thread{

    public  void run(){

        for(int i=1 ; i<=20 ;i++){

            if (i%2!=0) {
                
                System.out.println("Odd: " + i);
                
            }

        }
    }
} 

public class Lab11a1{
    public static void main(String[] args) {

        printGoodMorning gm = new printGoodMorning();
        Thread obj1 = new Thread(gm);
        obj1.start();

        OddNum obj2 = new OddNum();
        obj2.start();




        
        

    }
}