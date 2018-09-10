import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        int v=S.nextInt();
        //int t=S.nextInt();
        for(int i=2;i<=v;i++){
            if(v%i==0){
                System.out.print(i);
                break;
            }
        }
    }
}