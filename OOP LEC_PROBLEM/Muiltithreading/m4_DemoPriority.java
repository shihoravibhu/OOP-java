class MyThread1 extends Thread{
    String name;
    public MyThread1(String name){
        this.name = name;
    }
    public void run(){
        int i=0;
        while(true){
            i++;
            System.out.println("Thread "+name+", i = "+i);

            try {
                sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

public class m4_DemoPriority{
    public static void main(String[] args){
        MyThread1 mt1 = new MyThread1("Lect");
        MyThread1 mt2 = new MyThread1("Call");

        // mt1.setPriority(1);
        // mt2.setPriority(10);

       
        System.out.println(mt1.getPriority());

        mt1.start();
        mt2.start();
    }
}
