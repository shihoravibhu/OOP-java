// As Obejct ne perameter ma pass karvoo
// mutable (Object ma ferfar thaiii...)

class Time1 {

    int hour ;
    int minute ;
    int second ;

    Time1(int hour , int minute , int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public void add(Time1 temp){

        this.second += temp.second ;
        this.minute += this.second / 60 ;
        this.second = this.second % 60 ; 

        this.minute += temp.minute;
        this.hour += this.minute / 60;
        this.minute = this.minute % 60;

        this.hour += temp.hour;
        this.hour = this.hour % 24;

        

        // this.second -= temp.second ;
        // this.minute -= this.second / 60 ;
        // this.second = this.second % 60 ; 

        // this.minute -= temp.minute;
        // this.hour -= this.minute / 60;
        // this.minute = this.minute % 60;

        // this.hour -= temp.hour;
        // this.hour = this.hour % 24;
    }

    public void printTime(){
        System.out.println("Ans = "+this.hour+":"+this.minute+":"+this.second);
    }
}
public class Lab6a2q3 {
    public static void main(String[] args) {
        
        Time1 t1 = new Time1(1,2,45);
        Time1 t2 = new Time1(1,15,16);        

        t1.add(t2);

        t1.printTime();

    }
}
