import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        long cnt=0;
        int a=S.nextInt();
        for(int i=0;i<a;i++){
           int b=S.nextInt();
           cnt=cnt+b;
        }
        System.out.print(cnt);
    }
}