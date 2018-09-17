package KK;

import java.util.Scanner;

public class Time {
    int hour;
    int minute;
    int second;
    String res = "";
    public Time(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    };
    public String toUniversal() {
        if(hour>23){
            hour=hour%24;
        }
        if(minute>59){
            minute=minute%60;
        }
        if(second>59){
            second=second%60;
        }
        return hour+":"+minute+":"+second;
    }
    public String toStandard(){
        hour=hour%24;
        minute=minute%60;
        second=second%60;
        if(hour<=12){
            return hour+":"+minute+":"+second+":"+"AM";
        }else{
            hour=hour-12;
            if(hour<10)
                return "0"+hour+":"+minute+":"+second+":"+"PM";
            return hour+":"+minute+":"+second+":"+"PM";
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Time t=new Time(a,b,c);
        System.out.println("Universal: "+t.toUniversal());//prints"23:05:06"
        System.out.println("Standard: "+t.toStandard());//prints"11:05:06PM"
    }
}
