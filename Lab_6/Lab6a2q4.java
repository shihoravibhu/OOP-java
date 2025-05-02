class Time2 {

    int hour ;
    int minute ;
    int second ;

    Time2(int hour , int minute , int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public Time2 add(Time2 temp){

        Time2 ans = new Time2(0,0,0) ;

        ans.second = temp.second + this.second ;
        ans.minute = ans.second / 60 ;
        ans.second = ans.second % 60 ; 

        ans.minute += temp.minute + this.minute;
        ans.hour = this.hour + ans.minute / 60;
        ans.minute = ans.minute % 60;

        ans.hour += temp.hour + this.hour ;
        ans.hour = ans.hour % 24;

        return ans ;
    }

    public void printTime(Time2 temp2){
        System.out.println("Ans = "+temp2.hour+":"+temp2.minute+":"+temp2.second);
    }
}
public class Lab6a2q4 {
    public static void main(String[] args) {

        Time2 t1 = new Time2(1,2,45);
        Time2 t2 = new Time2(1,15,16);

        Time2 result = t1.add(t2);

        t1.printTime(result);
        
    }
}
