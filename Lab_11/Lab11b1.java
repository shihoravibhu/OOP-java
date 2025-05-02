// class OddNum extends Thread{

//     public  void run(){

//         for(int i=1 ; i<=20 ;i++){

//             if (i%2!=0) {
                
//                 System.out.println("Odd: " + i);
                
//             }

//         }
//     }
// } 

// class EvenNum extends Thread{

//     public void run(){

//         for(int i=1 ; i<=20 ;i++){

//             if (i%2==0) {
                
//                 System.out.println("Even: " + i);

//             }

//         }
//     }
// } 
// public class Lab11b1 {
//     public static void main(String[] args) {

//         OddNum obj1 = new OddNum();

//         EvenNum obj2 = new EvenNum();

//         obj1.start();
//         obj2.start();
        

//     }
// }

class Mt extends Thread{
    @Override
   public void run() {
    for(int i=1; i<=20; i++) {
       if(i%2!=0) {
          System.out.println("Odd : "+i);
       }
    }
   }
 }
 class Mt2 extends Thread{
    @Override
    public void run() {
       for(int i=1; i<=20; i++) {
          if(i%2==0) {
             System.out.println("Even : "+i);
          }
       }
    }
 }
 
 public class Lab11b1 {
    public static void main(String args[]) {
       Mt t1 = new Mt();
       t1.start();
       Mt2 t2 = new  Mt2(); 
       
       // try{
         //    Thread.sleep(1000);
         // }
         // catch(Exception e) {}
         try{
            t1.join();
            // t2.join();
         } catch(Exception e) {
            
         }
         t2.start(); 
         System.out.println("byy");
         
    }
 }
