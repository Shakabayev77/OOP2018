import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        int v=S.nextInt();
        int cnt=0;
        for(int i=1;i<=v;i++)
            if(v%i==0)
                cnt++;
        System.out.print(cnt);
    }
}