import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        int v=S.nextInt();
        if(v>0){
            System.out.print(1);
        }else if(v==0){
            System.out.println(0);
        }else{
            System.out.print(-1);
        }
    }
}