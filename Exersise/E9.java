class a {
    int num = 1;

    a() {
        System.out.println("From a");
    }

    public void display() {
        System.out.println("from a");
    }

    void display(int num) {
        System.out.println("num = " + num);
    }

    static void printhey() { // Static Method Cannot be Override
        System.out.println("Heyy From a.");
        // System.out.println("Heyy From a."+this.num); // And Also Not Refer To This
        // And Super KeyWord
        // System.out.println("Heyy From a."+num); // Only Allowed Static Members
    }

    static void printhey(int num1) {
        System.out.println("Heyy From a.");
    }

}

class b extends a {
    b() {
        System.out.println("From b");
    }

    // void printhey(){
    // System.out.println("Heyy From b.");
    // }
}

class c extends b {
    c() {
        System.out.println("From c");
    }

    // System.out.println("From c");

}

public class E9 {
    public static void main(String[] args) {

        int num1 = 10 ;
        int num2 = 10 ;

      a obj1 = new b();

      c obj2 = new c();

      obj1.printhey();

      System.out.println("Java"==new String("Java")); //String Comparsion Karva Mate Equals avee So Ahiya Output Ma False avse

      System.out.println(Math.pow(2,5));
      System.out.println(Math.floor(5.6));

        // int a[]={9,2,3,4,5} ;

        // // int ans = a++ + a++ ;

        // for(int i:a){

        //     System.out.println(i);
        // }



        // System.out.println("hey"+num1+num2);

        

    //    String word1 = "     heyy           from     darshan University" ;
    //    String word2 = word1.trim();

    //    System.out.println(word2);

    }
}
