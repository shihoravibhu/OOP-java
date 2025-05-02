class Phone{
    public void showTime(){
        System.out.println("Time...(In Phone)");
    }
    public void on(){                               // OverRiding its means 2 alag alag class ma same name ni method 
        System.out.println("Turnning On Phone...");        
    }
}
class SmartPhone extends Phone{

    public void music(){
        System.out.println("Playing Music...");
    }
    
    
    public void on(){                               // OverRiding 
        System.out.println("Turnning On SmartPhone...");        
    }

}
public class O6_Dynamic_Method_Dispatch {
    public static void main(String[] args) {

        Phone obj = new SmartPhone();  

       // obj.music();    // Not Allowed

       obj.on();           // Je Method ne Apde OverRiding Kareli Che Te Ni Child Class Vada Ni Method Call Thai And 

       obj.showTime();      // Je Koi Pan Method K Je Super Class Ma Che Te Call Kari Sakasee Super Class ni OverRind Vadi Method Call Nai Thai
     
        
    }
}
