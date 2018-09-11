import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;
import static java.sql.Types.NULL;

public class Data {

    private int count;
    private double summ;
    private double maximum;

    public Data(){
        count = 0;
    }

    public void add(double input){
        summ += input;
        if(count==0 || input > maximum)
            maximum = input;
        count++;
    }

    public double average(){
        if(count!=0)
            return summ/count;
        return 0;
    }
    public double max(){
        return maximum;
    }
    public static void main(String [] args){
        Data set = new Data();
        String input = "";
        Scanner sc = new Scanner(System.in);
        while(input != "Q"){
            System.out.print("Enter number (Q to quit): ");
            input = sc.next();
            try{
                set.add(Double.parseDouble(input));
            }catch( Exception e){
                break;
            }
        }
        System.out.printf("Average = %.1f\nMaximum = %.1f", set.average(), set.max());
    }
}