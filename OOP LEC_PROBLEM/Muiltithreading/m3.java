class MyThread implements Runnable{

    public void run(){

        while(true){

            System.out.println("heyy Fromm MyThared");
            
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }


}
public class m3 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());

        t1.start();
        t2.start();

        


        
    }
}
