class Random extends Thread {

    public void run(){

        while (true) {

            int num = (int) (Math.random()*100);

            if(num%2==0){
                Even e1 = new Even(num);
                e1.start();
            }
            else{
                Odd o = new Odd(num);
                o.start();
            }

            try{
                sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

class Even extends Thread{
    int num ;
    Even(int num){
        this.num = num ;
    }

    public void run(){
        System.out.println(this.num*this.num);
    }
} 
class Odd extends Thread{
    int num ;
    Odd(int num){
        this.num = num ;
    }

    public void run(){
        System.out.println(this.num*this.num*this.num);
    }
} 
public class Lab11b2 {
    public static void main(String[] args) {
        
        Random r1 = new Random();

        r1.start();
    }
}

