import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        double  a = S.nextInt();
        double  b = S.nextInt();
        double h=Math.sqrt((a*a)+(b*b));
        System.out.print(h);
 
    }
}