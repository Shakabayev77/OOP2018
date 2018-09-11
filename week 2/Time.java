public class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second){
        if(hour < 24 && hour >= 0 && minute < 60 && minute >= 0 && second < 60 && second >= 0){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public void add(Time t){
        this.hour = t.hour;
        this.minute = t.minute;
        this.second = t.second;
    }

    public String toUniversal(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandart(){
        String res;
        int h = hour;
        if(hour > 11){
            if(h != 12)
                h++;
            return String.format("%02d:%02d:%02d PM", h%13, minute, second);
        }else{
            if(h == 0)
                h = 12;
            return String.format("%02d:%02d:%02d AM",h, minute, second );
        }
    }

    public static void main(String [] args){
        Time t = new Time(13,00,00);
        System.out.println(t.toStandart());
        System.out.println(t.toUniversal());
        Time t2 = new Time(12, 15, 18);
        t.add(t2);
    }
}
