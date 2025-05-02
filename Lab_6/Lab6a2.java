import java.util.Scanner;

class Time {

    int hour = 0;
    int min = 0;
    int sec = 0;

    Time(int hour, int min, int sec) {

        this.hour = hour;
        this.min = min;
        this.sec = sec;

    }

    public void additionOfTime(int h1, int m1, int s1, int h2, int m2, int s2) {

        int ans_s = s1 + s2;
        int ans_m = m1 + m2;
        int ans_h = h1 + h2;

        if (ans_s > 59) {
            ans_s -= 60;
            ans_m++;
        }

        if (ans_m > 59) {
            ans_m -= 60;
            ans_h++;
        }

        System.out.println(ans_h + ":" + ans_m + ":" + ans_s);

    }

}

public class Lab6a2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hour1 , mim1  and sec1 :");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();

        System.out.println("Enter hour2 , mim2  and sec2 :");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();

        Time t1 = new Time(h1, m1, s1);
        Time t2 = new Time(h2, m2, s2);

        t1.additionOfTime(h1, m1, s1, h2, m2, s2);

        // int ans_s = t1.sec + t2.sec ;
        // int ans_m = t1.min + t2.min ;
        // int ans_h = t1.hour + t2.hour ;

        // if(ans_s>60){
        // ans_s -= 60 ;
        // ans_m++;
        // }

        // if(ans_m>60){
        // ans_m -= 60 ;k
        // ans_h++;
        // }

        // System.out.println(ans_h+":"+ans_m+":"+ans_s);

        sc.close();

    }
}
