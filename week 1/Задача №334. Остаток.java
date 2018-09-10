import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        int v=S.nextInt();
        int t=S.nextInt();
        int x=S.nextInt();
        int y=S.nextInt();
        for(int i=v;i<=t;i++){
            if(i%y==x){
                System.out.print(i+" ");
            }
        }
    }
}