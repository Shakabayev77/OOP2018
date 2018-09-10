import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        int v=S.nextInt();
        int t=S.nextInt();
        if(v>t){
            System.out.print(1);
        }else if(t>v){
            System.out.println(2);
        }else{
            System.out.print(0);
        }
    }
}