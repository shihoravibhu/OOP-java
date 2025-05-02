// Final Keyword

class Parent{                               // (3) Have jo Apde Class Ne Final Apiye To Class Ne Inherit Kari Sakase Nahi 

    final int a = 10 ;                      // (1) It's Called Final Variable 

    // a += 1 ;                             // Error Throw Because Final Variable is'nt Change 

    final void display(){                   // (2) OverRiding No Thai
        System.out.println("Heyy...");
    }

}

class Child extends Parent{

    // void display(){                       // Final Keyword Na Karne Overring na thai
    //     System.out.println("Heyy...");
    // }

}
public class Lab7a4 {
    public static void main(String[] args) {

        Parent p1 = new Parent();
        p1.display();
        
    }
}
