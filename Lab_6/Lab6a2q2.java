import java.util.*;

class Time {

    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void add(int hour2, int minute2, int second2) {

        this.second += second2;
        this.minute += this.second / 60;
        this.second = this.second % 60;

        this.minute += minute2;
        this.hour += this.minute / 60;
        this.minute = this.minute % 60;

        this.hour += hour2;
        this.hour = this.hour % 24;

    }

}

public class Lab6a2q2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hour , minute and second : ");
        Time t1 = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.println("Enter hour2 , minute2 and second2 : ");
        t1.add(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.println("addition = " + t1.hour + ":" + t1.minute + ":" + t1.second);

        sc.close();
    }
}
